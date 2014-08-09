package edu.bjfu.lol.Ӣ��.Ƥ��Ů��;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;

import edu.bjfu.lol.scenes.scene2d.actions.�ӳ�Action;
import edu.bjfu.lol.scenes.scene2d.actions.�����ƶ�Action;
import edu.bjfu.lol.scenes.scene2d.ui.������Ա��;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.screen.��ս��Ļ��;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ���ӵ��ɼ����� extends ������ {
	
	private static final int ��һ���ͷŻغ��� = 3;
	private static final int �ͷż���غ��� = 12;
	private static final int ���ܻ����˺� = 250;
	private static final float ���ܸ����˺���ռ���������� = 2.0f;
	private static final String ������ = "���ӵ���";
	private static final String �������� = String.format("%s  �����վ���׼������һ��,�Եз���������Ӣ�����%d(+%.0f��\n����)�����˺�,Ŀ��ǰ��Ӣ�ۻ�ΪĿ��Ӣ�������ӵ�.",
			������
			,���ܻ����˺�, ���ܸ����˺���ռ����������);
	public ���ӵ��ɼ�����() {
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class ��׼������ extends ������
	{
		private float ������X;
		private float ������Y;
		private String Ӣ��Ƥ���ļ���;
		public ��׼������(float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			������X = ������x;
			������Y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new ��׼������(������X, ������Y, Ӣ��Ƥ���ļ���);
		}
	}
	private class ��׼������ extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(1.3f);;
		private ������Ա�� ����;
		private Music ��Ч; 
		public ��׼������(float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "CaitlynSkillRFocus.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			����.addAction(�ӳ�);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "CaitlynSkillR.mp3"));
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		}
		@Override
		public boolean is���()
		{
			if (�ӳ�.isAction�ѽ���())
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
	private class �ͷ������� extends ������
	{
		private float ������X;
		private float ������Y;
		private float ������X;
		private float ������Y;
		private String Ӣ��Ƥ���ļ���;
		public �ͷ�������(float ������x, float ������y, float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			������X = ������x;
			������Y = ������y;
			������X = ������x;
			������Y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �ͷŶ�����(������X, ������Y, ������X, ������Y, Ӣ��Ƥ���ļ���);
		}
	}
	private class �ͷŶ����� extends ������
	{
		private �����ƶ�Action �ƶ�Action;
		private ������Ա�� ����; 
		public �ͷŶ�����(float ������X, float ������Y, float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "CaitlynSkillR.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			�ƶ�Action = new �����ƶ�Action(������X, ������Y, 0.3f);
			����.addAction(�ƶ�Action);
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
		}
	}
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��) {
		��ս��Ӣ���� ������Ӣ�� = �з�����.get��������Ӣ��(false);
		if (������Ӣ�� != null)
		{
			if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
			{
				������װ����.ʵ��.�������(new ��׼������(
						��ս��Ļ��.�з�X��������[������Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�з�Y��������[������Ӣ��.getӢ������λ��() - 1],
						�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
				������װ����.ʵ��.�������(new �ͷ�������(
						��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�з�X��������[������Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�з�Y��������[������Ӣ��.getӢ������λ��() - 1], 
						�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
			}
			else
			{
				������װ����.ʵ��.�������(new ��׼������(
						��ս��Ļ��.�ҷ�X��������[������Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�ҷ�Y��������[������Ӣ��.getӢ������λ��() - 1],
						�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
				������װ����.ʵ��.�������(new �ͷ�������(
						��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�ҷ�X��������[������Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�ҷ�Y��������[������Ӣ��.getӢ������λ��() - 1], 
						�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
			}
			������Ӣ�� = �з�����.get������Ӣ��ǰ����ΪĿ��ֵ��˺�Ӣ��(������Ӣ��.getӢ������λ��());
			int ����˺� = ������Ӣ��.����������˺�(�ͷŴ˼��ܵ�Ӣ��, (int) (���ܻ����˺� + ���ܸ����˺���ռ���������� * �ͷŴ˼��ܵ�Ӣ��.get��ս�й�����()), �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ���״�͸(), �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȻ��״�͸(), null);
			�ͷŴ˼��ܵ�Ӣ��.������Ѫ(����˺�, false);
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public String get��������() {
		return ��������;
	}
	@Override
	public String get������() {
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
