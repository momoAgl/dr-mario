package com.gamesbykevin.drmario.menu.layer;

import com.gamesbykevin.framework.menu.Layer;
import com.gamesbykevin.framework.util.Timer;
import com.gamesbykevin.framework.util.TimerCollection;

import com.gamesbykevin.drmario.engine.Engine;
import com.gamesbykevin.drmario.resource.*;
import com.gamesbykevin.drmario.menu.CustomMenu;

import java.awt.Rectangle;

public class Title extends Layer implements LayerRules
{
    public Title(final Engine engine)
    {
        super(Layer.Type.NONE, engine.getMain().getScreen());
        
        super.setImage(engine.getResources().getMenuImage(MenuImage.Keys.TitleScreen));

        //we will not force this layer to show
        setForce(false);
        
        //we do not want to pause this layer once it completes
        setPause(false);
        
        //the next layer to go to
        setNextLayer(CustomMenu.LayerKey.Credits);
        
        //this layer will be active for 2 seconds
        setTimer(new Timer(TimerCollection.toNanoSeconds(2000L)));
    }
    
    @Override
    public void setup(final Engine engine)
    {
        //no options here to setup
    }
}
