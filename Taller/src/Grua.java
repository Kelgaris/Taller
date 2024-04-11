import javax.swing.JOptionPane;

public class Grua extends Vehiculo {
    // Atributos adicionales
    private boolean eje;
    private boolean ruedas;
    private boolean bascula;
    private boolean pintura;
    private boolean motor;

    public Grua(String matricula, String modelo, String color, boolean eje, boolean ruedas, boolean bascula, boolean pintura, boolean motor) {
        super(matricula, modelo, color);
        this.eje = false;
        this.ruedas = false;
        this.bascula = false;
        this.pintura = false;
        this.motor = false;
    }

    public static Grua crearGrua(String matricula, String modelo, String color, boolean eje, boolean ruedas, boolean bascula, boolean pintura, boolean motor) {
        return new Grua(matricula, modelo, color, eje, ruedas, bascula, pintura, motor);
    }

    //G
    public boolean isEje() {
        return eje;
    }

    public boolean isRuedas() {
        return ruedas;
    }

    public boolean isBascula() {
        return bascula;
    }

    public boolean isPintura() {
        return pintura;
    }

    public boolean isMotor() {
        return motor;
    }

    //P
    @Override
    public void reparacion() {
        String seleccionado = JOptionPane.showInputDialog(null, "Que pieza desea reparar?\n- Eje\n- Ruedas\n- Bascula\n- Pintura\n- Motor");
        if (seleccionado != null) {
            switch (seleccionado.toLowerCase()) {
                case "eje":
                    if (isEje()) {
                        JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " de la grúa con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                    } else {
                        eje = true;
                        JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " de la grúa con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                    }
                    break;
                case "rodamiento":
                    if (isRuedas()) {
                        JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " de la grúa con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                    } else {
                        ruedas = true;
                        JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " de la grúa con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                    }
                    break;
                case "cristales":
                    if (isBascula()) {
                        JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " de la grúa con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                    } else {
                        bascula = true;
                        JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " de la grúa con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                    }
                    break;
                case "pintura":
                    if (isPintura()) {
                        JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " de la grúa con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                    } else {
                        pintura = true;
                        JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " de la grúa con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                    }
                    break;
                case "depósito":
                    if (isMotor()) {
                        JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " de la grúa con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                    } else {
                        motor = true;
                        JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " de la grúa con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                    }
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Pieza no encontrada");
                    break;
            }
        }

    }
}