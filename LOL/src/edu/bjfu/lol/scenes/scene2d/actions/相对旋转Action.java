package edu.bjfu.lol.scenes.scene2d.actions;

import com.badlogic.gdx.scenes.scene2d.actions.RotateByAction;

public class �����תAction extends RotateByAction implements Action����״̬�ӿ�
{
	private boolean isAction�ѽ���;
	public �����תAction(float rotationAmount, float duration)
	{
		setAmount(rotationAmount);
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