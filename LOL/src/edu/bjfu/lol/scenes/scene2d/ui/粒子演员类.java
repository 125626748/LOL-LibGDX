package edu.bjfu.lol.scenes.scene2d.ui;

import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.utils.Disposable;

public class ������Ա�� extends Actor implements Disposable
{
	private ParticleEffect ����Ч��;
	public ������Ա��(ParticleEffect ����Ч��)
	{
		this.����Ч�� = ����Ч��;
	}
	@Override
	public void dispose()
	{
		����Ч��.dispose();
	}
	@Override
	public void draw(SpriteBatch batch, float parentAlpha)
	{
		����Ч��.setPosition(getX(), getY());
		����Ч��.draw(batch);
	}
	@Override
	public void act(float delta)
	{
		super.act(delta);
		����Ч��.update(delta);
	}
	@Override
	public void setPosition(float x, float y)
	{
		super.setPosition(x, y);
	}
}
