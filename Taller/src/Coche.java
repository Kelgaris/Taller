import javax.swing.JOptionPane;

public class Coche extends Vehiculo{
    // ATRIBUTOS ADICIONALES
    private boolean ruedas;
    private boolean faros;
    private boolean luna;
    private boolean chapa;
    private boolean frenos;

    public Coche(String matricula, String modelo, String color, boolean ruedas, boolean aceite, boolean gps,
            boolean texturaPintura, boolean carroceria) {
        super(matricula, modelo, color);
        this.ruedas = false;
        this.faros = false;
        this.luna = false;
        this.chapa = false;
        this.frenos = false;
    }

    public static Coche crearCoche(String matricula, String modelo, String color, boolean ruedas, boolean faros,
            boolean luna, boolean chapa, boolean frenos) {
        return new Coche(matricula, modelo, color, ruedas, faros, luna, chapa, frenos);
    }

     // G
    public boolean isRuedas() {
        return ruedas;
    }

    public boolean isFaros() {
        return faros;
    }

    public boolean isLuna() {
        return luna;
    }

    public boolean isChapa() {
        return chapa;
    }

    public boolean isFrenos() {
        return frenos;
    }

    // P
    @Override
    public void reparacion() {
        String seleccionado = JOptionPane.showInputDialog(null,
                "Qué pieza desea reparar?\n- Ruedas\n- Faros\n- Luna\n- Chapa\n- Frenos");

        switch (seleccionado.toLowerCase()) {

            case "ruedas":
                if (isRuedas()) {
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del coche con matrícula " + matricula + ", de modelo " + modelo + " y color " +color + " no necesita ser reparado.");                
                } else 
                {
                    ruedas = true;
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del coche con matrícula " + matricula + ", de modelo " + modelo + " y color " +color + " ha sido reparado.");
                }
                break;

            case "faros":
                if (isFaros()) {
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del coche con matrícula " + matricula + ", de modelo " + modelo + " y color " +color + " no necesita ser reparado.");                
                } else {
                    faros = true;
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del coche con matrícula " + matricula + ", de modelo " + modelo + " y color " +color + " ha sido reparado.");

                }
                break;
            
            case "luna":
                if (isLuna()) {
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del coche con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");                
                } else {
                    luna = true;
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del coche con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " ha sido reparado.");
                }
                break;
    
            case "chapa":
                if (isChapa()) {
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del coche con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");                
                } else {
                    chapa = true;
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del coche con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " ha sido reparado.");
                }
                break;
    
            case "frenos":
                if (isFrenos()) {
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del coche con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");                
                } else {
                    frenos = true;
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del coche con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " ha sido reparado.");
                }
                break;

            default:
                JOptionPane.showMessageDialog(null, "No existe ese componente");
                break;

        }
    }
}
