package shawn.c4q.nyc.workproject.POJOS;

import java.util.ArrayList;
import java.util.List;

import shawn.c4q.nyc.workproject.POJOS.header.Display;

/**
 * Created by shawnspeaks on 11/14/16.
 */

public class Example {

    private Display display;
    private List<ColorPalette> colorPalette = new ArrayList<ColorPalette>();

    /**
     *
     * @return
     * The display
     */
    public Display getDisplay() {
        return display;
    }

    /**
     *
     * @param display
     * The display
     */
    public void setDisplay(Display display) {
        this.display = display;
    }

    /**
     *
     * @return
     * The colorPalette
     */
    public List<ColorPalette> getColorPalette() {
        return colorPalette;
    }

    /**
     *
     * @param colorPalette
     * The colorPalette
     */
    public void setColorPalette(List<ColorPalette> colorPalette) {
        this.colorPalette = colorPalette;
    }

}
