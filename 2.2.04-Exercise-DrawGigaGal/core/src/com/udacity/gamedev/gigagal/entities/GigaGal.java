package com.udacity.gamedev.gigagal.entities;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.math.Vector2;
import com.udacity.gamedev.gigagal.util.Assets;
import com.udacity.gamedev.gigagal.util.Constants;

public class GigaGal {

    public final static String TAG = GigaGal.class.getName();

    // TODO: Add a position
    Vector2 position;

    public GigaGal() {
        // TODO: Initialize GigaGal's position with height = GIGAGAL_EYE_HEIGHT
        position = new Vector2(64, Constants.GIGAGAL_EYE_HEIGHT);
    }

    public void update(float delta) {

    }

    public void render(SpriteBatch batch) {

        // TODO: Draw GigaGal's standing-right sprite at position - GIGAGAL_EYE_POSITION
        TextureAtlas.AtlasRegion region = Assets.instance.gigaGalAssets.standingRight;
        batch.draw(
                region,
                position.x - Constants.GIGAGAL_EYE_POSITION.x,
                position.y - Constants.GIGAGAL_EYE_POSITION.y,
                0,
                0,
                region.getRegionWidth(),
                region.getRegionHeight(),
                1,
                1,
                0);
    }
}
