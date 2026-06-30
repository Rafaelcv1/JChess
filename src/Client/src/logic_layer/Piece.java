package logic_layer;

import javax.swing.*;
import java.awt.*;

//todo: find a better place to these guys
public abstract class Piece {

    public Piece(Team team) {
        this.team = team;
    }

    public ImageIcon getIcon() {
        return icon;
    }
    public Team getTeam() {
        return team;
    }

    protected void setIcon(ImageIcon icon) {
        Image image = icon.getImage();
        this.icon = new ImageIcon(image.getScaledInstance(49,49, Image.SCALE_AREA_AVERAGING));
    }

    private ImageIcon icon;
    private final Team team;
}

