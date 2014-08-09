package edu.bjfu.lol.scenes.scene2d.ui;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.Actor;

public class ������Ա�� extends Actor
{
	private Animation ����;
	private float ����ʱ��;
	public ������Ա��(float ֡����, TextureRegion[] ֡����, int ����ģʽ)
	{
		���� = new Animation(֡����, ֡����);
		����.setPlayMode(����ģʽ);
		setSize(֡����[0].getRegionWidth(), ֡����[0].getRegionHeight());
	}
	@Override
	public void act(float delta)
	{
		super.act(delta);
		����ʱ�� += delta;
	}
	@Override
	public void draw(SpriteBatch batch, float parentAlpha)
	{
		Color color = getColor();
		batch.setColor(color.r, color.g, color.b, color.a * parentAlpha);
		batch.draw(����.getKeyFrame(����ʱ��), getX(), getY(), getWidth(), getHeight());
	}
	public boolean is�Ѿ�����()
	{
		return ����.isAnimationFinished(����ʱ��);
	}
}
