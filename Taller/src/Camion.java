import javax.swing.JOptionPane;

public class Camion extends Vehiculo {
    // Atributos adicionales
    private boolean ruedas;
    private boolean cambios;
    private boolean luna;
    private boolean suspension;
    private boolean tractora;

    public Camion(String matricula, String modelo, String color, boolean ruedas, boolean cambios, boolean luna, boolean suspension, boolean tractora) {
        super(matricula, modelo, color);
        this.ruedas = false;
        this.cambios = false;
        this.luna = false;
        this.suspension = false;
        this.tractora = false;
    }

    public static Camion crearCamion(String matricula, String modelo, String color, boolean ruedas, boolean cambios, boolean luna, boolean suspension, boolean tractora) {
        return new Camion(matricula, modelo, color, ruedas, cambios, luna, suspension, tractora);
    }

    //G
    public boolean isRuedas() {
        return ruedas;
    }

    public boolean isCambios() {
        return cambios;
    }

    public boolean isLuna() {
        return luna;
    }

    public boolean isSuspension() {
        return suspension;
    }

    public boolean isTractora() {
        return tractora;
    }

    //P
    @Override
    public void reparacion() {
        String seleccionado = JOptionPane.showInputDialog(null, "Qué pieza desea reparar?\n> Ruedas\n> Cambios\n> Llantas\n> Suspensión\n> Cadena");
        if (seleccionado != null) {
            switch (seleccionado.toLowerCase()) {
                case "ruedas":
                    if (isRuedas()) {
                        JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del camión con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                    } else {
                        ruedas = true;
                        JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " del camión con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                    }
                    break;
                case "cambios":
                    if (isCambios()) {
                        JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del camión con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                    } else {
                        cambios = true;
                        JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " del camión con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                    }
                    break;
                case "luna":
                    if (isLuna()) {
                        JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del camión con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                    } else {
                        luna = true;
                        JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " del camión con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                    }
                    break;
                case "suspensión":
                    if (isSuspension()) {
                        JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del camión con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                    } else {
                        suspension = true;
                        JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " del camión con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                    }
                    break;
                case "tractora":
                    if (isTractora()) {
                        JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del camión con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                    } else {
                        tractora = true;
                        JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " del camión con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Pieza no encontrada");
                    break;
            }
        }
    }
}