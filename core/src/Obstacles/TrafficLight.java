package Obstacles;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;

public class TrafficLight extends Obstacle {
    float locationX;
    float locationY;
    boolean greenLightOn;
    int position;

    public TrafficLight(int position, boolean greenLightOn) {
        set(new Sprite(new Texture("trafficLight.png")));
        SetPosition(position);

        ControlLight(greenLightOn);
    }

    @Override
    public int GetPosition(){
        return position;
    }

    private void SetPosition(int position) {
        this.position = position;

        switch (position) {
            case 1:
                this.locationX = 351;
                this.locationY = 409;
                this.rotate(90);
                break;
            case 2:
                this.locationX = 465;
                this.locationY = 372;
                break;
            case 3:
                this.locationX = 502;
                this.locationY = 487;
                this.rotate(90);
                break;
            case 4:
                this.locationX = 388;
                this.locationY = 523;
                break;
        }
        setX(locationX);
        setY(locationY);
    }

    public void ControlLight(boolean greenLightOn) {
        this.greenLightOn = greenLightOn;
        if (greenLightOn) {
            setColor(Color.GREEN);
        } else {
            setColor(Color.RED);
        }
    }

    @Override
    public boolean IsPassable() {
        return greenLightOn;
    }
}
