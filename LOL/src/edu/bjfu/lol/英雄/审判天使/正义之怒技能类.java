package edu.bjfu.lol.Ӣ��.������ʹ;

import java.util.Iterator;

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
import edu.bjfu.lol.��̬.��ս��Ӣ����.��ͨ��������Ч��״̬��;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.Ӣ��.������ʹ.ʥ�漼����.ʥ��״̬��;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ����֮ŭ������ extends ������
{
	private static final int ��һ���ͷŻغ��� = 1;
	private static final int �ͷż���غ��� = 8;
	private static final int ���ܻ����˺� = 20;
	private static final float ���ܸ����˺���ռ����ǿ�ȱ��� = 0.4f;
	private static final float ���ܸ����˺���ռ���������� = 0.2f;
	private static final int �����غ��� = 5;
	private static final String ������ = "����֮ŭ";
	private static final String �������� = String.format("%s  ����ÿ����ͨ��������ɶ����%d(+%.1f����ǿ��)ħ���˺�,\nĿ����Χ�ĵ��˻��ܵ�%d(+%.1f������)(+%.1f����ǿ��)ħ���˺�,����\n%d�غ�.",
			������
			,���ܻ����˺�, ���ܸ����˺���ռ����ǿ�ȱ���, ���ܻ����˺�, ���ܸ����˺���ռ����������, ���ܸ����˺���ռ����ǿ�ȱ���, �����غ���);
	protected static class �չ������˺�״̬�� extends ��ͨ��������Ч��״̬��
	{
		public �չ������˺�״̬��()
		{
			super(�����غ���);
		}
		@Override
		public void ��ͨ����(��ս��Ӣ���� ������, ��ս��Ӣ���� ��������, Iterator<��ͨ��������Ч��״̬��> ������)
		{
			Gdx.app.debug("����֮ŭ������.�չ������˺�״̬��.��ͨ����", String.format("%s��������֮ŭЧ��\n", ������.get����������λ��Ӣ������()));
			int ����˺� = 0;
			int �����˺� = (int) (���ܻ����˺� + ���ܸ����˺���ռ����ǿ�ȱ��� * ������.get��ս�з���ǿ��());
			int �����˺� = (int) (�����˺� + ���ܸ����˺���ռ���������� * ������.get��ս�й�����());
			int ��ֵ��͸ = ������.get��ս����ֵ������͸();
			float �ٷֱȴ�͸ = ������.get��ս�аٷֱȷ�����͸();
			���������� �������� = new ����������();
			for (��ս��Ӣ���� Ӣ�� : ��������.get��������().getĬ�ϱ�����С��ΧӢ������(������))
			{
				if (Ӣ�� != null && !Ӣ��.is����())
				{
					if (Ӣ�� == ��������)
					{
						����˺� += Ӣ��.�����ħ���˺�(������, �����˺�, ��ֵ��͸, �ٷֱȴ�͸, ��������);
					}
					else
					{
						ʥ��״̬��.ʩ��ʥ��Ч��(Ӣ��, ��������);
						����˺� += Ӣ��.�����ħ���˺�(������, �����˺�, ��ֵ��͸, �ٷֱȴ�͸, ��������);
					}
				}
			}
			������װ����.ʵ��.�������(��������);
			������.������Ѫ(����˺�, false);
		}
		@Override
		public String get״̬����()
		{
			return "����ÿ����ͨ������ɶ���ħ���˺���Ŀ����Χ�ĵ���Ҳ���ܵ��˺�";
		}
	}
	public ����֮ŭ������()
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
		private �ӳ�Action �ӳ� = new �ӳ�Action(1f);
		private ������Ա�� ����;
		private Music ��Ч;
		private �ͷŶ�����(float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "KayleSkillE.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			����.addAction(�ӳ�);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "KayleSkillE.mp3"));
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		}
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
		���������� �������� = new ����������();
		if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
		{
			��������.�������(new �ͷ�������(��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		else
		{
			��������.�������(new �ͷ�������(��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		��������.�������(new ״̬�ı���ʾ������(�ͷŴ˼��ܵ�Ӣ��.is�ҷ�(), �ͷŴ˼��ܵ�Ӣ��.getӢ������λ��(), "�չ������˺�", true));
		������װ����.ʵ��.�������(��������);
		�ͷŴ˼��ܵ�Ӣ��.�����ͨ��������Ч��״̬(new �չ������˺�״̬��());
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
