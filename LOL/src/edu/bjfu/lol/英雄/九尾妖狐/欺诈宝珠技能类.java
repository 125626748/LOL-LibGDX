package edu.bjfu.lol.Ӣ��.��β����;

import java.util.LinkedList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.SequenceAction;

import edu.bjfu.lol.scenes.scene2d.actions.�ӳ�Action;
import edu.bjfu.lol.scenes.scene2d.actions.�����ƶ�Action;
import edu.bjfu.lol.scenes.scene2d.ui.������Ա��;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.����������;
import edu.bjfu.lol.screen.��ս��Ļ��;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.Ӣ��.��β����.�����Ǽ�����.������״̬��;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ��թ���鼼���� extends ������
{
	private static final int ��һ���ͷŻغ��� = 1;
	private static final int �ͷż���غ��� = 4;
	private static final int �����˺� = 40;
	private static final float �����˺���ռ����ǿ�ȱ��� = 0.33f;
	private static final String ������ = "��թ����";
	private static final String �������� = String.format("%s  ����ų�����,�Եз��������%d(+%.2f����ǿ��)ħ���˺�,\n������ջ�,���%d(+%.2f����ǿ��)��ʵ�˺�.", 
			������
			,�����˺�, �����˺���ռ����ǿ�ȱ���, �����˺�, �����˺���ռ����ǿ�ȱ���);
	private class ��թ���������� extends ������
	{
		private float ������x;
		private float ������y;
		private float ������x;
		private float ������y;
		private String Ӣ��Ƥ���ļ���;
		private boolean is���ܷų�;
		private boolean is�����ջ�;
		public ��թ����������(float ������x, float ������y, float ������x, float ������y, String Ӣ��Ƥ���ļ���, boolean is���ܷų�, boolean is�����ջ�)
		{
			this.������x = ������x;
			this.������y = ������y;
			this.������x = ������x;
			this.������y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
			this.is���ܷų� = is���ܷų�;
			this.is�����ջ� = is�����ջ�;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new ��թ���鶯����(������x, ������y, ������x, ������y, Ӣ��Ƥ���ļ���, is���ܷų�, is�����ջ�);
		}
	}
	private class ��թ���鶯���� extends ������
	{
		private ������Ա�� ����;
		private �����ƶ�Action �ƶ�Action;
		private SequenceAction ����Action;
		private Music ��Ч;
		private boolean is�����ջ�;
		private ��թ���鶯����(float ������x, float ������y, float ������x, float ������y, String Ӣ��Ƥ���ļ���, boolean is���ܷų�, boolean is�����ջ�)
		{
			this.is�����ջ� = is�����ջ�;
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "AhriSkillQ.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������x, ������y);
			�ƶ�Action = new �����ƶ�Action(������x, ������y, .5f);
			if (is���ܷų�)
			{
				��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "AhriSkillQ.mp3"));
				��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
			}
			if (is�����ջ�)
			{
				�ӳ�Action �ӳ� = new �ӳ�Action(0.2f);
				����Action = Actions.sequence(�ƶ�Action, �ӳ�);
			}
		}
		@Override
		public boolean is���()
		{
			if (�ƶ�Action.isAction�ѽ���())
			{
				����.remove();
				����.dispose();
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
			if (is�����ջ�)
			{
				����.addAction(����Action);
			}
			else
			{
				����.addAction(�ƶ�Action);
			}
			��ս��Ļ��.ʵ��.�����Ա(����);
			if (��Ч != null)
			{
				��Ч.play();
			}
		}
	}
	public ��թ���鼼����()
	{
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��)
	{
		int �����˺� = (int) (�����˺� + �����˺���ռ����ǿ�ȱ��� * �ͷŴ˼��ܵ�Ӣ��.get��ս�з���ǿ��());
		int ����ħ���˺� = 0;
		int ��ֵ��͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ������͸();
		float �ٷֱȴ�͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȷ�����͸();
		��ս��Ӣ����[] ���ű�����Ӣ������ = �з�����.get���ű�����Ӣ������(�ͷŴ˼��ܵ�Ӣ��);
		LinkedList<��ս��Ӣ����> �������������� = new LinkedList<��ս��Ӣ����>();
		for (int i = 0; i < ���ű�����Ӣ������.length; i++)
		{
			��ս��Ӣ���� ���� = ���ű�����Ӣ������[i];
			if (���� != null && !����.is����())
			{
				��������������.add(����);
			}
		}
		float ����λ��X = 0;
		float ����λ��Y = 0;
		float һ������λ��X = 0;
		float һ������λ��Y = 0;
		if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
		{
			����λ��X = ��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1];
			����λ��Y = ��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1];
			if (��������������.isEmpty())
			{
				һ������λ��X = ������.��Ļ�� / 2;
				һ������λ��Y = ������.��Ļ�� * 2f / 3;
			}
			else
			{
				for (��ս��Ӣ���� Ӣ�� : ��������������)
				{
					һ������λ��X += ��ս��Ļ��.�з�X��������[Ӣ��.getӢ������λ��() - 1];
					һ������λ��Y += ��ս��Ļ��.�з�Y��������[Ӣ��.getӢ������λ��() - 1];
				}
				һ������λ��X /= ��������������.size();
				һ������λ��Y /= ��������������.size();
			}
		}
		else
		{
			����λ��X = ��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1];
			����λ��Y = ��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1];
			if (��������������.isEmpty())
			{
				һ������λ��X = ������.��Ļ�� / 2;
				һ������λ��Y = ������.��Ļ�� * 1f / 3;
			}
			else
			{
				for (��ս��Ӣ���� Ӣ�� : ��������������)
				{
					һ������λ��X += ��ս��Ļ��.�ҷ�X��������[Ӣ��.getӢ������λ��() - 1];
					һ������λ��Y += ��ս��Ļ��.�ҷ�Y��������[Ӣ��.getӢ������λ��() - 1];
				}
				һ������λ��X /= ��������������.size();
				һ������λ��Y /= ��������������.size();
			}
		}
		float ��������λ��X = (һ������λ��X - ����λ��X) * 2 + ����λ��X;
		float ��������λ��Y = (һ������λ��Y - ����λ��Y) * 2 + ����λ��Y;
		������װ����.ʵ��.�������(new ��թ����������(����λ��X, ����λ��Y, һ������λ��X, һ������λ��Y, �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(), true, false));
		���������� �������� = new ����������();
		��������.�������(new ��թ����������(һ������λ��X, һ������λ��Y, ��������λ��X, ��������λ��Y, �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(), false, false));
		for (int i = 0; i < ���ű�����Ӣ������.length; i++)
		{
			��ս��Ӣ���� ���� = ���ű�����Ӣ������[i];
			if (���� != null && !����.is����())
			{
				����ħ���˺� += ����.�����ħ���˺�(�ͷŴ˼��ܵ�Ӣ��, �����˺�, ��ֵ��͸, �ٷֱȴ�͸, ��������);
			}
		}
		������װ����.ʵ��.�������(��������);
		������״̬��.������Ѫ(�ͷŴ˼��ܵ�Ӣ��.is�ҷ�(), �ͷŴ˼��ܵ�Ӣ��.getӢ������λ��(), �ͷŴ˼��ܵ�Ӣ��, 1, ����ħ���˺�, true);
		������װ����.ʵ��.�������(new ��թ����������(��������λ��X, ��������λ��Y, һ������λ��X, һ������λ��Y, �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(), false, false));
		�������� = new ����������();
		��������.�������(new ��թ����������(һ������λ��X, һ������λ��Y, ����λ��X, ����λ��Y, �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(), false, true));
		for (int i = ���ű�����Ӣ������.length - 1; i >= 0; i--)
		{
			��ս��Ӣ���� ���� = ���ű�����Ӣ������[i];
			if (���� != null && !����.is����())
			{
				����.�������ʵ�˺�(�ͷŴ˼��ܵ�Ӣ��, �����˺�, ��������);
			}
		}
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
		return "B";
	}
}
