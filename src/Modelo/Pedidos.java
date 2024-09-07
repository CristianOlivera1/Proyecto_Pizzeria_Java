package Modelo;

public class Pedidos {
    private int id;
    private int id_sala;
    private int num_mesa;
    private String fecha;
    private double total;
    private String sala;
    private String usuario;
    private String estado;

    public Pedidos() {
    }

    public Pedidos(int id, int id_sala, int num_mesa, String fecha, double total, String sala, String usuario, String estado) {
        this.id = id;
        this.id_sala = id_sala;
        this.num_mesa = num_mesa;
        this.fecha = fecha;
        this.total = total;
        this.sala = sala;
        this.usuario = usuario;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_sala() {
        return id_sala;
    }

    public void setId_sala(int id_sala) {
        this.id_sala = id_sala;
    }

    public int getNum_mesa() {
        return num_mesa;
    }

    public void setNum_mesa(int num_mesa) {
        this.num_mesa = num_mesa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    
        
}
