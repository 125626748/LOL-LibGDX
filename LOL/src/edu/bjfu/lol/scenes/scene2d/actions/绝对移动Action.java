package edu.bjfu.lol.scenes.scene2d.actions;

import com.badlogic.gdx.scenes.scene2d.actions.MoveToAction;

public class �����ƶ�Action extends MoveToAction implements Action����״̬�ӿ�
{
	private boolean isAction�ѽ���;
	public �����ƶ�Action(float x, float y, float duration)
	{
		setPosition(x, y);
		setDuration(duration);
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
