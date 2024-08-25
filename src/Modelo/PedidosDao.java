
package Modelo;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.draw.LineSeparator;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.filechooser.FileSystemView;

public class PedidosDao {
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    int r;
    
    public int IdPedido(){
        int id = 0;
        String sql = "SELECT MAX(id) FROM pedidos";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return id;
    }
    
    public int verificarStado(int mesa, int id_sala){
        int id_pedido = 0;
        String sql = "SELECT id FROM pedidos WHERE num_mesa=? AND id_sala=? AND estado = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, mesa);
            ps.setInt(2, id_sala);
            ps.setString(3, "PENDIENTE");
            rs = ps.executeQuery();
            if(rs.next()){
                id_pedido = rs.getInt("id");
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return id_pedido;
    }
    
    public int RegistrarPedido(Pedidos ped){
        String sql = "INSERT INTO pedidos (id_sala, num_mesa, total, usuario) VALUES (?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ped.getId_sala());
            ps.setInt(2, ped.getNum_mesa());
            ps.setDouble(3, ped.getTotal());
            ps.setString(4, ped.getUsuario());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println(e.toString());
            }
        }
        return r;
    }
    
    public int RegistrarDetalle(DetallePedido det){
       String sql = "INSERT INTO detalle_pedidos (nombre, precio, cantidad, comentario, id_pedido) VALUES (?,?,?,?,?)";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, det.getNombre());
            ps.setDouble(2, det.getPrecio());
            ps.setInt(3, det.getCantidad());
            ps.setString(4, det.getComentario());
            ps.setInt(5, det.getId_pedido());
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
        return r;
    }
    
    public List verPedidoDetalle(int id_pedido){
       List<DetallePedido> Lista = new ArrayList();
       String sql = "SELECT d.* FROM pedidos p INNER JOIN detalle_pedidos d ON p.id = d.id_pedido WHERE p.id = ?";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setInt(1, id_pedido);
           rs = ps.executeQuery();
           while (rs.next()) {               
               DetallePedido det = new DetallePedido();
               det.setId(rs.getInt("id"));
               det.setNombre(rs.getString("nombre"));
               det.setPrecio(rs.getDouble("precio"));
               det.setCantidad(rs.getInt("cantidad"));
               det.setComentario(rs.getString("comentario"));
               Lista.add(det);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   }
    
    public Pedidos verPedido(int id_pedido){
        Pedidos ped = new Pedidos();
       String sql = "SELECT p.*, s.nombre FROM pedidos p INNER JOIN salas s ON p.id_sala = s.id WHERE p.id = ?";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setInt(1, id_pedido);
           rs = ps.executeQuery();
            if (rs.next()) {               
               
               ped.setId(rs.getInt("id"));
               ped.setFecha(rs.getString("fecha"));
               ped.setSala(rs.getString("nombre"));
               ped.setNum_mesa(rs.getInt("num_mesa"));
               ped.setTotal(rs.getDouble("total"));
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return ped;
   }
    
    public List finalizarPedido(int id_pedido){
       List<DetallePedido> Lista = new ArrayList();
       String sql = "SELECT d.* FROM pedidos p INNER JOIN detalle_pedidos d ON p.id = d.id_pedido WHERE p.id = ?";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           ps.setInt(1, id_pedido);
           rs = ps.executeQuery();
           while (rs.next()) {               
               DetallePedido det = new DetallePedido();
               det.setId(rs.getInt("id"));
               det.setNombre(rs.getString("nombre"));
               det.setPrecio(rs.getDouble("precio"));
               det.setCantidad(rs.getInt("cantidad"));
               det.setComentario(rs.getString("comentario"));
               Lista.add(det);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   }
    
   public void pdfPedido(int id_pedido) {
    String fechaPedido = null, usuario = null, total = null, sala = null, num_mesa = null;
    try {
        FileOutputStream archivo;
        String url = FileSystemView.getFileSystemView().getDefaultDirectory().getPath();
        File salida = new File(url + File.separator + "pedido.pdf");
        archivo = new FileOutputStream(salida);
        Document doc = new Document();
        PdfWriter.getInstance(doc, archivo);
        doc.open();

        // Título del documento
        Paragraph titulo = new Paragraph("Reporte de Pedido", 
                         new Font(Font.FontFamily.TIMES_ROMAN, 18, Font.BOLD, BaseColor.BLACK));
        titulo.setAlignment(Element.ALIGN_CENTER);
        doc.add(titulo);
        doc.add(Chunk.NEWLINE);

        // Cargar la imagen del logo
        Image img = Image.getInstance(getClass().getResource("/Img/logo_pdf.png"));
        img.scaleToFit(100, 100);

        // Información del pedido
        String informacion = "SELECT p.*, s.nombre FROM pedidos p INNER JOIN salas s ON p.id_sala = s.id WHERE p.id = ?";
        try {
            ps = con.prepareStatement(informacion);
            ps.setInt(1, id_pedido);
            rs = ps.executeQuery();
            if (rs.next()) {
                num_mesa = rs.getString("num_mesa");
                sala = rs.getString("nombre");
                fechaPedido = rs.getString("fecha");
                usuario = rs.getString("usuario");
                total = rs.getString("total");
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        // Encabezado con logo e información de la empresa
        PdfPTable encabezado = new PdfPTable(4);
        encabezado.setWidthPercentage(100);
        encabezado.getDefaultCell().setBorder(Rectangle.NO_BORDER);
        encabezado.setWidths(new float[]{20f, 20f, 60f, 60f});

        encabezado.addCell(img);
        encabezado.addCell("");

        // Información de la empresa
        String config = "SELECT * FROM config";
        String mensaje = "";
        try {
            ps = con.prepareStatement(config);
            rs = ps.executeQuery();
            if (rs.next()) {
                mensaje = rs.getString("mensaje");
                encabezado.addCell("RUC: " + rs.getString("ruc") 
                        + "\nNombre: " + rs.getString("nombre") 
                        + "\nTeléfono: " + rs.getString("telefono") 
                        + "\nDirección: " + rs.getString("direccion"));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        // Información del pedido y usuario
        Paragraph info = new Paragraph();
        Font negrita = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, BaseColor.BLACK);
        info.add("Atendido por: " + usuario 
                + "\nN° Pedido: " + id_pedido 
                + "\nFecha: " + fechaPedido
                + "\nSala: " + sala
                + "\nN° Mesa: " + num_mesa);
        encabezado.addCell(info);

        doc.add(encabezado);
        doc.add(Chunk.NEWLINE);
        doc.add(new Paragraph(new Chunk(new LineSeparator()))); // Línea de separación

        // Tabla de productos
        PdfPTable tabla = new PdfPTable(4);
        tabla.setWidthPercentage(100);
        tabla.getDefaultCell().setBorder(Rectangle.NO_BORDER);
        tabla.setWidths(new float[]{10f, 50f, 15f, 15f});

        PdfPCell c1 = new PdfPCell(new Phrase("Cant.", negrita));
        PdfPCell c2 = new PdfPCell(new Phrase("Plato", negrita));
        PdfPCell c3 = new PdfPCell(new Phrase("P. Unit.", negrita));
        PdfPCell c4 = new PdfPCell(new Phrase("P. Total", negrita));
        c1.setBackgroundColor(BaseColor.LIGHT_GRAY);
        c2.setBackgroundColor(BaseColor.LIGHT_GRAY);
        c3.setBackgroundColor(BaseColor.LIGHT_GRAY);
        c4.setBackgroundColor(BaseColor.LIGHT_GRAY);
        c1.setBorder(Rectangle.NO_BORDER);
        c2.setBorder(Rectangle.NO_BORDER);
        c3.setBorder(Rectangle.NO_BORDER);
        c4.setBorder(Rectangle.NO_BORDER);

        tabla.addCell(c1);
        tabla.addCell(c2);
        tabla.addCell(c3);
        tabla.addCell(c4);

        String product = "SELECT d.* FROM pedidos p INNER JOIN detalle_pedidos d ON p.id = d.id_pedido WHERE p.id = ?";
        try {
            ps = con.prepareStatement(product);
            ps.setInt(1, id_pedido);
            rs = ps.executeQuery();
            while (rs.next()) {
                double subTotal = rs.getInt("cantidad") * rs.getDouble("precio");
                tabla.addCell(rs.getString("cantidad"));
                tabla.addCell(rs.getString("nombre"));
                tabla.addCell(rs.getString("precio"));
                tabla.addCell(String.valueOf(subTotal));
            }
        } catch (SQLException e) {
            System.out.println(e.toString());
        }

        doc.add(tabla);
        doc.add(Chunk.NEWLINE);

        // Total del pedido
        Paragraph agra = new Paragraph("Total S/: " + total, negrita);
        agra.setAlignment(Element.ALIGN_RIGHT);
        doc.add(agra);
        doc.add(Chunk.NEWLINE);
        doc.add(new Paragraph(new Chunk(new LineSeparator()))); // Línea de separación

        // Sección de firma
        Paragraph firma = new Paragraph();
        firma.add("Cancelación \n\n");
        firma.add("------------------------------------\n");
        firma.add("Firma \n");
        firma.setAlignment(Element.ALIGN_CENTER);
        doc.add(firma);
        doc.add(Chunk.NEWLINE);

        // Mensaje de agradecimiento
        Paragraph gr = new Paragraph(mensaje);
        gr.setAlignment(Element.ALIGN_CENTER);
        doc.add(gr);

        doc.close();
        archivo.close();
        Desktop.getDesktop().open(salida);

    } catch (DocumentException | IOException e) {
        System.out.println(e.toString());
    } finally {
        try {
            con.close();
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
    }
}

    
    public boolean actualizarEstado (int id_pedido){
        String sql = "UPDATE pedidos SET estado = ? WHERE id = ?";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, "FINALIZADO");
            ps.setInt(2, id_pedido);
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println(e.toString());
            return false;
        }
    }
    
    public List listarPedidos(){
       List<Pedidos> Lista = new ArrayList();
       String sql = "SELECT p.*, s.nombre FROM pedidos p INNER "
               + "JOIN salas s ON p.id_sala = s.id ORDER BY p.fecha DESC";
       try {
           con = cn.getConnection();
           ps = con.prepareStatement(sql);
           rs = ps.executeQuery();
           while (rs.next()) {               
               Pedidos ped = new Pedidos();
               ped.setId(rs.getInt("id"));
               ped.setSala(rs.getString("nombre"));
               ped.setNum_mesa(rs.getInt("num_mesa"));
               ped.setFecha(rs.getString("fecha"));
               ped.setTotal(rs.getDouble("total"));
               ped.setUsuario(rs.getString("usuario"));
               ped.setEstado(rs.getString("estado"));
               Lista.add(ped);
           }
       } catch (SQLException e) {
           System.out.println(e.toString());
       }
       return Lista;
   }
    
}
