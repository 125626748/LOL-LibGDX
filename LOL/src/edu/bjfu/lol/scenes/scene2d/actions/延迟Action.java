package edu.bjfu.lol.scenes.scene2d.actions;

import com.badlogic.gdx.scenes.scene2d.actions.TemporalAction;

public class �ӳ�Action extends TemporalAction implements Action����״̬�ӿ�
{
	public �ӳ�Action(float duration)
	{
		setDuration(duration);
	}
	private boolean isAction�ѽ���;
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
	@Override
	protected void update(float percent){}
}
