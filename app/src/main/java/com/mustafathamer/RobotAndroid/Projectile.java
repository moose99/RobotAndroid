package com.mustafathamer.RobotAndroid;

import android.graphics.Rect;

/**
 * Created by Mus on 11/26/2016.
 */

public class Projectile
{

    private int x, y, speedY;
    private boolean visible;

    private Rect r;

    public Projectile(int startX, int startY)
    {
        x = startX;
        y = startY;
        speedY = 7;
        visible = true;

        r = new Rect(0, 0, 0, 0);
    }

    public void update()
    {
        y -= speedY;
        r.set(x, y, x + 10, y + 5);
        if (y < 0)
        {
            visible = false;
            r = null;
        }

        if (y > 0)
        {
            checkCollision();
        }
    }

    private void checkCollision()
    {
/*
        if (Rect.intersects(r, GameScreen.hb.r))
        {
            visible = false;

            if (GameScreen.hb.health > 0)
            {
                GameScreen.hb.health -= 1;
            }
            if (GameScreen.hb.health == 0)
            {
                GameScreen.hb.setCenterX(-100);

            }

        }

        if (Rect.intersects(r, GameScreen.hb2.r))
        {
            visible = false;

            if (GameScreen.hb2.health > 0)
            {
                GameScreen.hb2.health -= 1;
            }
            if (GameScreen.hb2.health == 0)
            {
                GameScreen.hb2.setCenterX(-100);


            }
        }
*/
    }


    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public int getSpeedY() { return speedY; }

    public boolean isVisible()
    {
        return visible;
    }

    public void setX(int x)
    {
        this.x = x;
    }
    public void setY(int y)
    {
        this.y = y;
    }
    public void setSpeedY(int speedY)
    {
        this.speedY = speedY;
    }
    public void setVisible(boolean visible)
    {
        this.visible = visible;
    }


}