package edu.bjfu.lol.Ӣ��.Ƥ��Ů��;

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

class Լ�¶��ղ��������� extends ������
{
	private static final int ��һ���ͷŻغ��� = 2;
	private static final int �ͷż���غ��� = 10;
	private static final int ���ܻ����˺� = 80;
	private static final int ����ֵ����غ��� = 1;
	private static final int ��¶�غ��� = 2;
	private static final float ���ܸ����˺���ռ����ǿ�ȱ��� = 0.6f;
	private static final String ������ = "Լ�¶��ղ���";
	private static final String �������� = String.format("%s  �����ղ���һ������,�����Ŀ�����%d(+%.0f����ǿ��)ħ\n���˺�,����ֵ����%d�غ�,����¶�������ĵ���%d�غ�.",
			������
			,���ܻ����˺�, ���ܸ����˺���ռ����ǿ�ȱ���, ����ֵ����غ���, ��¶�غ���);
	private static class ����ֵ����״̬�� extends edu.bjfu.lol.��̬.��ս��Ӣ����.����ֵ����״̬��
	{
		public ����ֵ����״̬��()
		{
			super(����ֵ����غ���);
		}
		@Override
		public String get״̬����()
		{
			return "Լ�¶��ղ���������ֵ����";
		}
	}
	private static class ��¶״̬�� extends ����״̬��
	{
		public ��¶״̬��()
		{
			super(��¶�غ���);
		}
		@Override
		public String get״̬����()
		{
			return "Լ�¶��ղ���������¶";
		}
	}
	public Լ�¶��ղ���������()
	{
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class �ͷ������� extends ������
	{
		private float ������X;
		private float ������Y;
		private String Ӣ��Ƥ���ļ���;
		public �ͷ�������(float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			������X = ������x;
			������Y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �ͷŶ�����(������X, ������Y, Ӣ��Ƥ���ļ���);
		}
	}
	private class �ͷŶ����� extends ������
	{
		private �ӳ�Action �ӳ�;
		private ������Ա�� ����;
		private Music ��Ч; 
		public �ͷŶ�����(float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "CaitlynSkillW.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			�ӳ� = new �ӳ�Action(0.5f);
			����.addAction(�ӳ�);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "CaitlynSkillW.mp3"));
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
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��)
	{
		��ս��Ӣ���� ������Ӣ�� = �з�����.get���������Ӣ��(true);
		���������� �������� = new ����������();
		��������.�������(new ״̬�ı���ʾ������(������Ӣ��.is�ҷ�(), ������Ӣ��.getӢ������λ��(), "����,����ֵ����", false));
		if (������Ӣ��.is�ҷ�())
		{
			��������.�������(new �ͷ�������(
					��ս��Ļ��.�ҷ�X��������[������Ӣ��.getӢ������λ��() - 1],
					��ս��Ļ��.�ҷ�Y��������[������Ӣ��.getӢ������λ��() - 1], 
					�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		else
		{
			��������.�������(new �ͷ�������(
					��ս��Ļ��.�з�X��������[������Ӣ��.getӢ������λ��() - 1],
					��ս��Ļ��.�з�Y��������[������Ӣ��.getӢ������λ��() - 1], 
					�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		������Ӣ��.�������״̬(new ��¶״̬��(), ��������);
		������Ӣ��.�������ֵ����״̬(new ����ֵ����״̬��());
		int ����˺� = ������Ӣ��.�����ħ���˺�(�ͷŴ˼��ܵ�Ӣ��, (int) (�ͷŴ˼��ܵ�Ӣ��.get��ս�з���ǿ��() * ���ܸ����˺���ռ����ǿ�ȱ��� + ���ܻ����˺�), �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ������͸(), �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȷ�����͸(), ��������);
		������װ����.ʵ��.�������(��������);
		�ͷŴ˼��ܵ�Ӣ��.������Ѫ(����˺�, false);
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
