package edu.bjfu.lol.scenes.scene2d.actions;

import com.badlogic.gdx.scenes.scene2d.actions.SizeToAction;

public class ��������X��С���Ա仯Action extends SizeToAction implements Action����״̬�ӿ�
{
	private boolean isAction�ѽ���;
	public ��������X��С���Ա仯Action(float width, float height, float duration)
	{
		setSize(width, height);
		setDuration(duration);
	}
	protected void update (float percent) {
		float x = actor.getX();
		float ����X = x + actor.getWidth() / 2;
		super.update(percent);
		actor.setX(����X - actor.getWidth() / 2);
	}
	@Override
	protected void end()
	{
		isAction�ѽ��� = true;
	}
	@Override
	public boolean isAction�ѽ���()
	{
		return isAction�ѽ���;
	}
}
