package edu.bjfu.lol.Ӣ��.ĺ��֮��;

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

class ����Ӱ�������� extends ������
{
	private static final int ��һ���ͷŻغ��� = 1;
	private static final int �ͷż���غ��� = 8;
	private static final int ���ܻ����˺� = 50;
	private static final float ���ܸ����˺���ռ����ǿ�ȱ��� = 0.5f;
	private static final float ������ = 70f / 100;
	private static final float �˺�����ٷֱ� = 50f / 100;
	private static final int Ч�������غ��� = 1;
	private static final String ������ = "����Ӱ��";
	private static final String �������� = String.format("%s  ����Ŀ�������ͳ�,�Եз�С��Χ���%d(+%.1f����ǿ��)ħ��\n�˺�,���Ե��˽��г���,������%.0f%%,��������,�����%.0f%%�˺�����,\nЧ������%d�غ�.", 
			������
			,���ܻ����˺�, ���ܸ����˺���ռ����ǿ�ȱ���, ������ * 100, �˺�����ٷֱ� * 100, Ч�������غ���);
	private static class �˺�����Ч��״̬�� extends ״̬��
	{
		public �˺�����Ч��״̬��()
		{
			super(Ч�������غ���);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��)
		{
			��״̬����Ӣ��.����˺��ٷֱȼ���(�˺�����ٷֱ�);
		}
		@Override
		public String get״̬����()
		{
			return "����Ӱ�����˺�����";
		}
	}
	public ����Ӱ��������()
	{
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class �ͷ������� extends ������
	{
		private float ������x;
		private float ������y;
		private boolean is�ҷ��ͷ�;
		private String Ӣ��Ƥ���ļ���;
		public �ͷ�������(float ������x, float ������y, boolean is�ҷ��ͷ�, String Ӣ��Ƥ���ļ���)
		{
			this.������x = ������x;
			this.������y = ������y;
			this.is�ҷ��ͷ� = is�ҷ��ͷ�;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �ͷŶ�����(������x, ������y, is�ҷ��ͷ�, Ӣ��Ƥ���ļ���);
		}
	}
	private class �ͷŶ����� extends ������
	{
		private �����ƶ�Action �ƶ�Action;
		private ������Ա�� ����;
		private Music ��Ч;
		public �ͷŶ�����(float ������X, float ������Y, boolean is�ҷ��ͷ�, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			float ������X = ������.��Ļ�� / 2;
			float ������Y = 0;
			if (is�ҷ��ͷ�)
			{
				������Y = ������.��Ļ��;
			}
			if (������X > ������X)
			{
				����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "ShenSkillER.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			}
			else
			{
				����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "ShenSkillEL.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			}
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			�ƶ�Action = new �����ƶ�Action(������X, ������Y, 0.6f);
			����.addAction(�ƶ�Action);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "ShenSkillE.mp3"));
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
		�ͷŴ˼��ܵ�Ӣ��.����˺�����״̬(new �˺�����Ч��״̬��());
		���������� �������� = new ����������();
		��������.�������(new ״̬�ı���ʾ������(�ͷŴ˼��ܵ�Ӣ��.is�ҷ�(), �ͷŴ˼��ܵ�Ӣ��.getӢ������λ��(), "�˺�����", true));
		int �����˺� = (int) (���ܻ����˺� + ���ܸ����˺���ռ����ǿ�ȱ��� * �ͷŴ˼��ܵ�Ӣ��.get��ս�з���ǿ��());
		int ����˺� = 0;
		boolean is���� = false;
		int ��ֵ��͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ������͸();
		float �ٷֱȴ�͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȷ�����͸();
		for (��ս��Ӣ���� �з�Ӣ�� : �з�����.getĬ�ϱ�����С��ΧӢ������(�ͷŴ˼��ܵ�Ӣ��))
		{
			if (�з�Ӣ�� != null && !�з�Ӣ��.is����())
			{
				if (������.����_����_�����Ƿ���(������))
				{
					�з�Ӣ��.������(Ч�������غ���,  ��������);
					����˺� += �з�Ӣ��.�����ħ���˺�(�ͷŴ˼��ܵ�Ӣ��, �����˺�, ��ֵ��͸, �ٷֱȴ�͸, ��������);
					is���� = true;
				}
			}
		}
		if (is����)
		{
			�ͷŴ˼��ܵ�Ӣ��.������(Ч�������غ���, ��������);
		}
		if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
		{
			��������.�������(new �ͷ�������(��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], true, �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		else
		{
			��������.�������(new �ͷ�������(��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], false, �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		������װ����.ʵ��.�������(��������);
		if (is����)
		{
			�ͷŴ˼��ܵ�Ӣ��.������Ѫ(����˺�, true);
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
		return "D";
	}
}
