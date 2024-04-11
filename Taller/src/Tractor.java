import javax.swing.JOptionPane;

public class Tractor extends Vehiculo {
    // Atributos adicionales
    private boolean ruedas;
    private boolean motor;
    private boolean piston;
    private boolean motorFuerza;
    private boolean eje;

    public Tractor(String matricula, String modelo, String color, boolean parabrisas, boolean motor, boolean piston, boolean fusibles, boolean radio) {
        super(matricula, modelo, color);
        this.ruedas = false;
        this.motor = false;
        this.piston = false;
        this.motorFuerza = false;
        this.eje = false;
    }

    public static Tractor crearTractor(String matricula, String modelo, String color, boolean ruedas, boolean motor, boolean piston, boolean motorFuerza, boolean eje) {
        return new Tractor(matricula, modelo, color, ruedas, motor, piston, motorFuerza, eje);
    }

    //G
    public boolean isRuedas() {
        return ruedas;
    }

    public boolean isMotor() {
        return motor;
    }

    public boolean isPiston() {
        return piston;
    }

    public boolean isMotorFuerza() {
        return motorFuerza;
    }

    public boolean isEje() {
        return eje;
    }

    //P
    @Override
public void reparacion() {
    String seleccionado = JOptionPane.showInputDialog(null, "Que pieza desea reparar?\n- Ruedas\n- Motor\n- Pistón\n- Motor fuerza\n- Eje");
    if (seleccionado != null) {
        switch (seleccionado.toLowerCase()) {
            case "ruedas":
                if (isRuedas()) {
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del tractor con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                } else {
                    ruedas = true;
                    JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " del tractor con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                }
                break;
            case "motor":
                if (isMotor()) {
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del tractor con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                } else {
                    motor = true;
                    JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " del tractor con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                }
                break;
            case "pistón":
                if (isPiston()) {
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del tractor con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                } else {
                    piston = true;
                    JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " del tractor con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                }
                break;
            case "motor fuerza":
                if (isMotorFuerza()) {
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del tractor con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                } else {
                    motorFuerza = true;
                    JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " del tractor con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                }
                break;
            case "radio":
                if (isEje()) {
                    JOptionPane.showMessageDialog(null, "El componente " + seleccionado + " del tractor con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + " no necesita ser reparado.");
                } else {
                    eje = true;
                    JOptionPane.showMessageDialog(null, "Se ha reparado el componente " + seleccionado + " del tractor con matrícula " + matricula + ", de modelo " + modelo + " y color " + color + ".");
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Pieza no encontrada");
                break;
        }
    }
}
}