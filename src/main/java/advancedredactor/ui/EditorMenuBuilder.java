package advancedredactor.ui;

import arc.scene.ui.layout.Table;
import mindustry.ui.Styles;
import arc.graphics.Color;

public class EditorMenuBuilder {

    public static Table createRightMenu() {
        Table menu = new Table(Styles.black8);
        menu.margin(14f);
        
        menu.add("Advanced Tools").color(Color.orange).padBottom(10f).row();
        menu.image().color(Color.darkGray).fillX().height(4f).padBottom(10f).row();
        
        menu.button("Option 1", Styles.flatBordert, () -> {}).size(160f, 50f).padBottom(5f).row();
        menu.button("Option 2", Styles.flatBordert, () -> {}).size(160f, 50f).padBottom(5f).row();
        menu.button("Option 3", Styles.flatBordert, () -> {}).size(160f, 50f).padBottom(5f).row();
        menu.button("Option 4", Styles.flatBordert, () -> {}).size(160f, 50f).padBottom(5f).row();
        
        return menu;
    }

    public static void applySplitLayout(Table container, Table originalOrangeBox) {
        container.clearChildren();
        
        container.add(originalOrangeBox).left().padRight(25f);
        container.add(createRightMenu()).right().growY();
    }
}
