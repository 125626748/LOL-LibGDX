package edu.bjfu.lol.scenes.scene2d.����;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.SequenceAction;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.Label.LabelStyle;

import edu.bjfu.lol.����;
import edu.bjfu.lol.scenes.scene2d.actions.�ӳ�Action;
import edu.bjfu.lol.scenes.scene2d.actions.����ƶ�Action;
import edu.bjfu.lol.screen.��ս��Ļ��;
import edu.bjfu.lol.screen.��ս��Ļ��.Ӣ��������;

public class ״̬�ı���ʾ������ extends ������
{
	private static LabelStyle �����ǩ��ʽ;
	private static LabelStyle �����ǩ��ʽ;
	private Label ��ǩ;
	private �ӳ�Action ������ʾ�ӳ�Action = new �ӳ�Action(0.8f);
	private Ӣ�������� Ӣ������;
	public ״̬�ı���ʾ������(Ӣ�������� Ӣ������, String �ı�, boolean is����)
	{
		this.Ӣ������ = Ӣ������;
		if (is����)
		{
			if (�����ǩ��ʽ == null)
			{
				�����ǩ��ʽ = new LabelStyle(����.ʵ��.getUIƤ����Դ().getFont("default"), new Color(52f/255, 201f/255, 223f/255, 1));
			}
			��ǩ = new Label(�ı�, �����ǩ��ʽ);
		}
		else
		{
			if (�����ǩ��ʽ == null)
			{
				�����ǩ��ʽ = new LabelStyle(����.ʵ��.getUIƤ����Դ().getFont("default"), new Color(230f/255, 40f/255, 30f/255, 1));
			}
			��ǩ = new Label(�ı�, �����ǩ��ʽ);
		}
		float �������ű��� = 0.6f;
		��ǩ.setFontScale(�������ű���);
		��ǩ.setSize(��ǩ.getWidth() * �������ű���, ��ǩ.getHeight() * �������ű���);
		����ƶ�Action ������ʾ����Action = new ����ƶ�Action(0, ��ǩ.getHeight(), 0.2f);
		SequenceAction ����Action = Actions.sequence(������ʾ����Action, ������ʾ�ӳ�Action);
		��ǩ.addAction(����Action);
	}
	@Override
	public boolean is���()
	{
		if (������ʾ�ӳ�Action.isAction�ѽ���())
		{
			��ǩ.remove();
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public void ��ʼ()
	{
		��ǩ.setPosition(Ӣ������.getX() + Ӣ������.getWidth() / 2 - ��ǩ.getWidth() / 2, Ӣ������.getHeight() + Ӣ������.getY() - ��ǩ.getHeight());
		��ս��Ļ��.ʵ��.�����Ա(��ǩ);
	}
}
