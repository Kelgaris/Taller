import javax.swing.JOptionPane;

public class Moto extends Vehiculo {
    private boolean ruedas;
    private boolean frenos;
    private boolean suspension;
    private boolean escape;
    private boolean cristal;



    public Moto(String matricula, String modelo, String color, boolean ruedas, boolean frenos, boolean suspension, boolean escape, boolean cristal) {
        super(matricula, modelo, color);
        this.ruedas = false;
        this.frenos = false;
        this.suspension = false;
        this.escape = false;
        this.cristal = false;
    }

    public static Moto crearMoto(String matricula, String modelo, String color, boolean ruedas, boolean frenos, boolean suspension, boolean escape, boolean cristal) {
        return new Moto(matricula, modelo, color, ruedas, frenos, suspension, escape, cristal);
    }

    //G
    public boolean isRuedas() {
        return ruedas;
    }

    public boolean isFrenos() {
        return frenos;
    }

    public boolean isSuspension() {
        return suspension;
    }

    public boolean isEscape() {
        return escape;
    }

    public boolean isCristal() {
        return cristal;
    }

    //P
    public void reparacion() {
    String seleccionado = JOptionPane.showInputDialog(null, "Que pieza desea reparar?\n- Ruedas\n- Frenos\n- Suspensión\n- Escape\n- Cristal");
    if (seleccionado != null) {
        switch (seleccionado.toLowerCase()) {
            case "ruedas":
                if (isRuedas()) {
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " de la moto con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                } else {
                    ruedas = true;
                    JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " de la moto con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                }
                break;
            case "frenos":
                if (isFrenos()) {
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " de la moto con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                } else {
                    frenos = true;
                    JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " de la moto con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                }
                break;
            case "suspensión":
                if (isSuspension()) {
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " de la moto con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                } else {
                    suspension = true;
                    JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " de la moto con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                }
                break;
            case "escape":
                if (isEscape()) {
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " de la moto con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                } else {
                    escape = true;
                    JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " de la moto con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                }
                break;
            case "cristal":
                if (isCristal()) {
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " de la moto con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                } else {
                    cristal = true;
                    JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " de la moto con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "La pieza no ha sido encontrada");
                break;
        }
    }
}
}