package edu.bjfu.lol.Ӣ��.��������;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;

import edu.bjfu.lol.scenes.scene2d.actions.�����ƶ�Action;
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
import edu.bjfu.lol.�߼�.������;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ħ��ˮ���������� extends ������
{
	private static final int ��һ���ͷŻغ��� = 2;
	private static final int �ͷż���غ��� = 10;
	private static final int ���ܻ����˺� = 250;
	private static final float ������ = 70f / 100;
	private static final float ���ܸ����˺���ռ����ǿ�ȱ��� = 1.0f;
	private static final int ѣ�λغ��� = 2;
	private static final float ��������ֵ�ٷֱ� = 50f / 100;
	private static final int ����ֵ���ٳ����غ��� = 1;
	private static final String ������ = "ħ��ˮ����";
	private static final String �������� = String.format("%s  ��ϣ��ǰ�����ħ��ˮ����,������%.0f%%,���ез�Ӣ��ʱ��\n��%d(+%.1f����ǿ��)ħ���˺�,��ѣ�δ�Ŀ��,ѣ��%d�غ�,ͬʱ�Ըõ���\n��Χ�����������һ���˺�,����������ֵ%.0f%%,����%d�غ�.",
			������
			,������ * 100, ���ܻ����˺�, ���ܸ����˺���ռ����ǿ�ȱ���, ѣ�λغ���, ��������ֵ�ٷֱ� * 100, ����ֵ���ٳ����غ���);
	private static class ����ֵ����״̬�� extends ״̬��
	{
		public ����ֵ����״̬��()
		{
			super(����ֵ���ٳ����غ���);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��)
		{
			��״̬����Ӣ��.�������ֵ�ٷֱȱ仯(-��������ֵ�ٷֱ�);
		}
		@Override
		public String get״̬����()
		{
			return "��ħ��ˮ��������Ч������ֵ����";
		}
	}
	public ħ��ˮ����������()
	{
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class �ͷ������� extends ������
	{
		private float ������x;
		private float ������y;
		private float ������x;
		private float ������y;
		private String Ӣ��Ƥ���ļ���;
		private boolean is����;
		public �ͷ�������(float ������x, float ������y, float ������x, float ������y, String Ӣ��Ƥ���ļ���, boolean is����)
		{
			this.������x = ������x;
			this.������y = ������y;
			this.������x = ������x;
			this.������y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
			this.is���� = is����;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �ͷŶ�����(������x, ������y, ������x, ������y, Ӣ��Ƥ���ļ���, is����);
		}
	}
	private class �ͷŶ����� extends ������
	{
		private �����ƶ�Action �ƶ�Action;
		private ������Ա�� ����;
		private Music ��Ч;
		public �ͷŶ�����(float ������x, float ������y, float ������x, float ������y, String Ӣ��Ƥ���ļ���, boolean is����)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "AsheSkillR.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			float �Ƕ� = (float)(Math.atan((������y-������y)/(������x-������x)) / Math.PI * 180) - 90;
			if (������x < ������x)
			{
				�Ƕ� += 180;
			}
			����Ч��.findEmitter("Untitled").getRotation().setHigh(�Ƕ�);
			���� = new ������Ա��(����Ч��);
			����.setPosition(������x, ������y);
			�ƶ�Action = new �����ƶ�Action(������x, ������y, 0.5f);
			����.addAction(�ƶ�Action);
			if (is����)
			{
				��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "AsheSkillR.mp3"));
			}
			else
			{
				��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "AsheSkillRMiss.mp3"));
			}
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
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
			��ս��Ļ��.ʵ��.�����Ա(����);
			��Ч.play();
		}
	}
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��)
	{
		if (������.����_����_�����Ƿ���(������))
		{
			��ս��Ӣ���� ������Ӣ�� = �з�����.getĬ�ϱ�����Ӣ��(�ͷŴ˼��ܵ�Ӣ��);
			if (������Ӣ�� != null)
			{
				if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
				{
					������װ����.ʵ��.�������(new �ͷ�������(��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�з�X��������[������Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�з�Y��������[������Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(), true));
				}
				else
				{
					������װ����.ʵ��.�������(new �ͷ�������(��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�ҷ�X��������[������Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�ҷ�Y��������[������Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(), true));	
				}
				int �����˺�ֵ = (int) (���ܻ����˺� + ���ܸ����˺���ռ����ǿ�ȱ��� * �ͷŴ˼��ܵ�Ӣ��.get��ս�з���ǿ��());
				���������� �������� = new ����������();
				������Ӣ��.��ѣ��(ѣ�λغ���, ��������);
				int ��������˺� = 0;
				int ��ֵ��͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ������͸();
				float �ٷֱȴ�͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȷ�����͸();
				for (��ս��Ӣ���� ������Ӣ�� : �з�����.getĬ�ϱ�����С��ΧӢ������(�ͷŴ˼��ܵ�Ӣ��))
				{
					if (������Ӣ�� != null && !������Ӣ��.is����())
					{
						������Ӣ��.�������ֵ����״̬(new ����ֵ����״̬��());
						��������.�������(new ״̬�ı���ʾ������(������Ӣ��.is�ҷ�(), ������Ӣ��.getӢ������λ��(), "����ֵ��", false));
						if (������Ӣ�� == ������Ӣ��)
						{
							��������˺� += ������Ӣ��.�����ħ���˺�(�ͷŴ˼��ܵ�Ӣ��, �����˺�ֵ, ��ֵ��͸, �ٷֱȴ�͸, ��������);
						}
						else
						{
							��������˺� += ������Ӣ��.�����ħ���˺�(�ͷŴ˼��ܵ�Ӣ��, (int) (�����˺�ֵ * 0.5f), ��ֵ��͸, �ٷֱȴ�͸, ��������);
						}
					}
				}
				������װ����.ʵ��.�������(��������);
				�ͷŴ˼��ܵ�Ӣ��.������Ѫ(��������˺�, true);
			}
			else
			{
				if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
				{
					������װ����.ʵ��.�������(new �ͷ�������(��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ������.��Ļ�� / 2, ������.��Ļ��, �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(), false));
				}
				else
				{
					������װ����.ʵ��.�������(new �ͷ�������(��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ������.��Ļ�� / 2, 0, �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(), false));
				}
			}
		}
		else
		{
			if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
			{
				������װ����.ʵ��.�������(new �ͷ�������(��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ������.��Ļ�� / 2, ������.��Ļ��, �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(), false));
			}
			else
			{
				������װ����.ʵ��.�������(new �ͷ�������(��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ������.��Ļ�� / 2, 0, �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(), false));
			}
		}
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
		return "E";
	}
	@Override
	public boolean is����()
	{
		return true;
	}
}
