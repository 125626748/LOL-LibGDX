package edu.bjfu.lol.scenes.scene2d.actions;

import com.badlogic.gdx.scenes.scene2d.actions.MoveByAction;

public class ����ƶ�Action extends MoveByAction implements Action����״̬�ӿ�
{
	private boolean isAction�ѽ���;
	public ����ƶ�Action(float amountX, float amountY, float duration)
	{
		setAmount(amountX, amountY);
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
