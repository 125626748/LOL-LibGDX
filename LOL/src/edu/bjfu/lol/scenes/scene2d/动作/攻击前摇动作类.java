package edu.bjfu.lol.scenes.scene2d.����;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.MoveByAction;
import com.badlogic.gdx.scenes.scene2d.actions.RotateByAction;
import com.badlogic.gdx.scenes.scene2d.actions.SequenceAction;

import edu.bjfu.lol.scenes.scene2d.actions.�����תAction;
import edu.bjfu.lol.scenes.scene2d.actions.����ƶ�Action;


public class ����ǰҡ������ extends ������
{
	private static final int Զ�̻ζ����� = 10;
	private static final float Զ������ζ�ʱ�� = 0.3f;
	private static final float ��սҡ�ڽǶ� = 15f;
	public static final float ��ս����ڶ�ʱ�� = 0.3f; 
	private Actor Ӣ��ͼƬ;
	private SequenceAction Զ������Action;
	private ����ƶ�Action Զ������Action;
	private SequenceAction ��սҡ��Action;
	private �����תAction ��ս�ص�Action;
	private int Z���;
	private boolean is��ս;
	public ����ǰҡ������(Actor Ӣ��ͼƬ, boolean is�����ι���, boolean is��ս, boolean is�ҷ�)
	{
		this.Ӣ��ͼƬ = Ӣ��ͼƬ;
		this.is��ս = is��ս;
		if (is��ս)
		{
			RotateByAction ҡ������ = Actions.rotateBy(is�����ι��� ? ��սҡ�ڽǶ� : -��սҡ�ڽǶ�, ��ս����ڶ�ʱ�� / 2);
			��ս�ص�Action = new �����תAction(is�����ι��� ? -��սҡ�ڽǶ� : ��սҡ�ڽǶ�, ��ս����ڶ�ʱ�� / 2);
			��սҡ��Action = Actions.sequence(ҡ������, ��ս�ص�Action);
		}
		else
		{
			MoveByAction �������� = Actions.moveBy(0, is�ҷ� ? Զ�̻ζ����� : -Զ�̻ζ�����, Զ������ζ�ʱ�� / 2);
			Զ������Action = new ����ƶ�Action(0, is�ҷ� ? -Զ�̻ζ����� : Զ�̻ζ�����, Զ������ζ�ʱ�� / 2);
			Զ������Action = Actions.sequence(��������, Զ������Action);
		}
	}
	@Override
	public boolean is���()
	{
		if (is��ս)
		{
			if (��ս�ص�Action.isAction�ѽ���())
			{
				Ӣ��ͼƬ.setZIndex(Z���);
				return true;
			}
		}
		else
		{
			if (Զ������Action.isAction�ѽ���())
			{
				Ӣ��ͼƬ.setZIndex(Z���);
				return true;
			}
		}
		return false;
	}
	@Override
	public void ��ʼ()
	{
		Z��� = Ӣ��ͼƬ.getZIndex();
		Ӣ��ͼƬ.setZIndex(Integer.MAX_VALUE);
		if (is��ս)
		{
			Ӣ��ͼƬ.addAction(��սҡ��Action);
		}
		else
		{
			Ӣ��ͼƬ.addAction(Զ������Action);
		}
	}
}
