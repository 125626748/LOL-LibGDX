package edu.bjfu.lol.Ӣ��.ĺ��֮��;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;

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
import edu.bjfu.lol.��̬.��ս��Ӣ����.����״̬��;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class �ذ���ȱ��Ȼ��似���� extends ������
{
	private static final int ��һ���ͷŻغ��� = 3;
	private static final int �ͷż���غ��� = 15;
	private static final int �����غ��� = 2;
	private static final int ���������˺� = 250;
	private static final float ���������˺���ռ����ǿ�ȱ��� = 1.35f;
	private static final String ������ = "�ذ���ȱ��Ȼ���";
	private static final String �������� = String.format("%s  ��Ϊ�������ص��Ѿ����������˺��Ļ���,��%d�غ�\n����ʱ����ΪĿ������%d(+%.2f����ǿ��)���˺�.",
			������
			,�����غ���, ���������˺�, ���������˺���ռ����ǿ�ȱ���);
	private static class �����˺�����״̬�� extends ����״̬��
	{
		public �����˺�����״̬��(int ����ֵ)
		{
			super(�����غ���, ����ֵ);
		}
		@Override
		public String get״̬����()
		{
			return "�ذ���ȱ��Ȼ��䣬����ΪĿ�������˺�";
		}
	}
	public �ذ���ȱ��Ȼ��似����()
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
		public �ͷ�������(float ������x, float ������y, float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			this.������x = ������x;
			this.������y = ������y;
			this.������x = ������x;
			this.������y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �ͷŶ�����(������x, ������y, ������x, ������y, Ӣ��Ƥ���ļ���);
		}
	}
	private class �ͷŶ����� extends ������
	{
		private �ӳ�Action �ӳ�;
		private ������Ա�� ��������;
		private ������Ա�� ��������;
		private Music ��Ч;
		public �ͷŶ�����(float ������X, float ������Y, float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ��������Ч�� = new ParticleEffect();
			��������Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "ShenSkillRGiver.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			�������� = new ������Ա��(��������Ч��);
			��������.setPosition(������X, ������Y);
			�ӳ� = new �ӳ�Action(1.5f);
			��������.addAction(�ӳ�);
			ParticleEffect ��������Ч�� = new ParticleEffect();
			��������Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "ShenSkillRReceiver.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			�������� = new ������Ա��(��������Ч��);
			��������.setPosition(������X, ������Y);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "ShenSkillR.mp3"));
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		}
		@Override
		public boolean is���()
		{
			if (�ӳ�.isAction�ѽ���())
			{
				��������.remove();
				��������.dispose();
				��������.remove();
				��������.dispose();
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
			��ս��Ļ��.ʵ��.�����Ա(��������);
			��ս��Ļ��.ʵ��.�����Ա(��������);
			��Ч.play();
		}
	}
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��)
	{
		��ս��Ӣ���� ���������Ѿ� = �ͷŴ˼��ܵ�Ӣ��.get��������().get��������Ӣ��(true);
		if (���������Ѿ� != �ͷŴ˼��ܵ�Ӣ��)
		{
			���������� �������� = new ����������();
			if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
			{
				��������.�������(new �ͷ�������(��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�ҷ�X��������[���������Ѿ�.getӢ������λ��()-1], ��ս��Ļ��.�ҷ�Y��������[���������Ѿ�.getӢ������λ��()-1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
			}
			else
			{
				��������.�������(new �ͷ�������(��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�з�X��������[���������Ѿ�.getӢ������λ��()-1], ��ս��Ļ��.�з�Y��������[���������Ѿ�.getӢ������λ��()-1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
			}
			Gdx.app.debug("�ذ���ȱ��Ȼ��似����.�ͷ�", String.format("��%s�ͷŰ���ȱ��Ȼ���\n", ���������Ѿ�.get����������λ��Ӣ������()));
			��������.�������(new ״̬�ı���ʾ������(���������Ѿ�.is�ҷ�(), ���������Ѿ�.getӢ������λ��(), "����", true));
			������װ����.ʵ��.�������(��������);
			���������Ѿ�.��ӻ���״̬(new �����˺�����״̬��((int) (�ͷŴ˼��ܵ�Ӣ��.get��ս�з���ǿ��() * ���������˺���ռ����ǿ�ȱ��� + ���������˺�)));
			return true;
		}
		else
		{
			return false;
		}
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
