package edu.bjfu.lol.Ӣ��.��Ѫ����;

import java.util.LinkedList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.math.Vector2;

import edu.bjfu.lol.scenes.scene2d.actions.�ӳ�Action;
import edu.bjfu.lol.scenes.scene2d.ui.������Ա��;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.����������;
import edu.bjfu.lol.scenes.scene2d.����.״̬�ı���ʾ������;
import edu.bjfu.lol.screen.��ս��Ļ��;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ����ŭ������ extends ������
{
	private static final int ��һ���ͷŻغ��� = 1;
	private static final int �ͷż���غ��� = 12;
	private static final float �����ٶ����Ӱٷֱ� = 40f / 100;
	private static final int ���ٳ����غ��� = 5;
	private static final String ������ = "����ŭ��";
	private static final String �������� = String.format("%s  ����˷����̶�ŭ��,�����Լ�%.0f%%�Ĺ����ٶ�,ͬʱ��ȫ����\n������һ��ļ���Ч��,����%d�غ�.",
			������
			,�����ٶ����Ӱٷֱ� * 100, ���ٳ����غ���);
	private static class ����״̬�� extends ״̬��
	{
		private boolean is��������;
		public ����״̬��(boolean is��������)
		{
			super(���ٳ����غ���);
			this.is�������� = is��������;
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��)
		{
			��״̬����Ӣ��.��ӹ����ٶȰٷֱȱ仯(is�������� ? �����ٶ����Ӱٷֱ� : �����ٶ����Ӱٷֱ� / 2);
		}
		@Override
		public String get״̬����()
		{
			return "����ŭ�����ӹ����ٶ�";
		}
	}
	public ����ŭ������()
	{
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class �ͷ������� extends ������
	{
		private String Ӣ��Ƥ���ļ���;
		private LinkedList<Vector2> λ������ = new LinkedList<Vector2>();
		public �ͷ�������(LinkedList<��ս��Ӣ����> �ӹ���Ӣ������, String Ӣ��Ƥ���ļ���)
		{
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
			for (��ս��Ӣ���� Ӣ�� : �ӹ���Ӣ������)
			{
				if (Ӣ��.is�ҷ�())
				{
					λ������.add(new Vector2(��ս��Ļ��.�ҷ�X��������[Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�ҷ�Y��������[Ӣ��.getӢ������λ��()-1]));
				}
				else
				{
					λ������.add(new Vector2(��ս��Ļ��.�з�X��������[Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�з�Y��������[Ӣ��.getӢ������λ��()-1]));
				}
			}
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �ͷŶ�����(λ������, Ӣ��Ƥ���ļ���);
		}
	}
	private class �ͷŶ����� extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(1);
		private Music ��Ч;
		private ������Ա��[] ��������;
		private �ͷŶ�����(LinkedList<Vector2> λ������, String Ӣ��Ƥ���ļ���)
		{
			�������� = new ������Ա��[λ������.size()];
			for (int i = 0; i < ��������.length; i++)
			{
				ParticleEffect ����Ч�� = new ParticleEffect();
				����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "WarwickSkillW.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
				��������[i] = new ������Ա��(����Ч��);
				Vector2 λ�� = λ������.get(i);
				��������[i].setPosition(λ��.x, λ��.y);
			}
			��������[0].addAction(�ӳ�);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "WarwickSkillW.mp3"));
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		}
		@Override
		public boolean is���()
		{
			if (�ӳ�.isAction�ѽ���())
			{
				for (������Ա�� ���� : ��������)
				{
					����.remove();
				}
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
			��Ч.play();
			for (������Ա�� ���� : ��������)
			{
				��ս��Ļ��.ʵ��.�����Ա(����);
			}
		}
	}
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��)
	{
		���������� �������� = new ����������();
		LinkedList<��ս��Ӣ����> �ӹ���Ӣ������ = new LinkedList<��ս��Ӣ����>();
		for (��ս��Ӣ���� Ӣ�� : �ͷŴ˼��ܵ�Ӣ��.get��������().get��ս��Ӣ������())
		{
			if (Ӣ�� != null && !Ӣ��.is����())
			{
				�ӹ���Ӣ������.add(Ӣ��);
				��������.�������(new ״̬�ı���ʾ������(Ӣ��.is�ҷ�(), Ӣ��.getӢ������λ��(), "���١�", true));
				if (Ӣ�� == �ͷŴ˼��ܵ�Ӣ��)
				{
					�ͷŴ˼��ܵ�Ӣ��.��ӹ����ٶ�����״̬(new ����״̬��(true));
				}
				else
				{
					�ͷŴ˼��ܵ�Ӣ��.��ӹ����ٶ�����״̬(new ����״̬��(false));
				}
			}
		}
		��������.�������(new �ͷ�������(�ӹ���Ӣ������, �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		������װ����.ʵ��.�������(��������);
		return true;
	}
	@Override
	public String get��������()
	{
		return ��������;
	}
	@Override
	public String get������()
	{
		return ������;
	}
	@Override
	public String get�����ļ���׺()
	{
		return "C";
	}
}
