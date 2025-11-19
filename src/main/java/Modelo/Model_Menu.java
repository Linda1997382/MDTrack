package Modelo;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class Model_Menu {

    private String id;
    private String icon;
    private String name;
    private MenuType type;

    public Model_Menu() {}

    public Model_Menu(String icon, String name, MenuType type) {
        this(null, icon, name, type);
    }

    public Model_Menu(String id, String icon, String name, MenuType type) {
        this.id = id;
        this.icon = icon;
        this.name = name;
        this.type = type;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getIcon() { return icon; }
    public void setIcon(String icon) { this.icon = icon; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public MenuType getType() { return type; }
    public void setType(MenuType type) { this.type = type; }

    public Icon toIcon() {
        try {
            if (icon == null || icon.trim().isEmpty()) {
                return null;
            }

            String iconPath = "/imagenes/" + icon + ".png";
            java.net.URL resource = getClass().getResource(iconPath);

            if (resource == null) {
                System.err.println("Icono no encontrado: " + iconPath);
                return null;
            }

            return new ImageIcon(resource);
        } catch (Exception e) {
            System.err.println("Error cargando icono: " + e.getMessage());
            return null;
        }
    }

    @Override
    public String toString() {
        return name != null ? name : "";
    }

    public static enum MenuType {
        TITLE,
        MENU,
        EMPTY
    }
}
