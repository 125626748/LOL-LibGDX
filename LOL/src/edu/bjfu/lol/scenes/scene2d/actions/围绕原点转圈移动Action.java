package edu.bjfu.lol.scenes.scene2d.actions;

import com.badlogic.gdx.scenes.scene2d.actions.TemporalAction;

public class Χ��ԭ��תȦ�ƶ�Action extends TemporalAction
{
	private float ԭ��x;
	private float ԭ��y;
	private float �뾶;
	public Χ��ԭ��תȦ�ƶ�Action(float ԭ��x, float ԭ��y, float �뾶, float duration)
	{
		this.�뾶 = �뾶;
		this.ԭ��x = ԭ��x;
		this.ԭ��y = ԭ��y;
		setDuration(duration);
	}
	@Override
	protected void update(float percent)
	{
		double ���� = percent * 2 * Math.PI;
		actor.setX((float) (Math.cos(����) * �뾶 + ԭ��x));
		actor.setY((float) (Math.sin(����) * �뾶 + ԭ��y));
	}
	@Override
	public boolean act(float delta)
	{
		return super.act(delta);
	}
}