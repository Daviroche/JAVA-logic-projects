public class Carro extends VeiculoBase implements Veiculo, Motor {

    private int id;
    private String marca;
    private String modelo;
    private String fabricante;
       
    @Override
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    @Override
    public String getMarca() {
        return this.marca;
    }
    
    public void setMarca(String marca) {
        this.marca = marca;
    } 
    
    @Override
    public String getModelo() {
        return this.modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }    
    
    @Override
    public String getFabricante() {
        return this.fabricante;
    }
    
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    
    public String toString() {
        return "\nId: " + this.id
             + "\nMarca: " + this.marca
             + "\nModelo: " + this.modelo
             + "\nFabricante: " + this.fabricante
             + "\nChassis: " + this.chassi;
    }
}