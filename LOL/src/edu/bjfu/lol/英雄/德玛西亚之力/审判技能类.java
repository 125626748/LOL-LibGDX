package edu.bjfu.lol.Ӣ��.��������֮��;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.ParallelAction;
import com.badlogic.gdx.scenes.scene2d.actions.RepeatAction;
import com.badlogic.gdx.scenes.scene2d.actions.RotateByAction;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

import edu.bjfu.lol.scenes.scene2d.actions.�ӳ�Action;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.����������;
import edu.bjfu.lol.scenes.scene2d.����.״̬�ı���ʾ������;
import edu.bjfu.lol.screen.��ս��Ļ��;
import edu.bjfu.lol.utils.ͼ�������;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��Ӣ����.��������ʩ��״̬��;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.�߼�.������;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ���м����� extends ������
{
	private static final int ��һ���ͷŻغ��� = 3;
	private static final int �ͷż���غ��� = 8;
	private static final int ����ʩ���غ��� = 2;
	private static final int ���ܻ����˺� = 20;
	private static final float ���ܸ����˺���ռ�������ٷֱ� = 70f / 100;
	private static final float ������ = 0.7f;
	private static final float ����ֵ���Ͱٷֱ� = 5f / 100;
	private static final int ����ֵ���ͳ����غ��� = 2;
	private static final String ������ = "����";
	private static final String �������� = String.format("%s  ���׿��ٵػ����,ÿ�غ϶Եз�С��Χ���%d��������������\n%.0f%%�������˺�,�˺����Ա���,����%d�غ�,������%.0f%%,������е��˸�\n�����������ֵ�ή��%.0f%%,����%d�غ�.",
			������
			,���ܻ����˺�, ���ܸ����˺���ռ�������ٷֱ� * 100, ����ʩ���غ���, ������ * 100, ����ֵ���Ͱٷֱ� * 100, ����ֵ���ͳ����غ���);
	private static class ������������ʩ��״̬�� extends ��������ʩ��״̬��
	{
		public ������������ʩ��״̬��()
		{
			super(����ʩ���غ���);
		}
		@Override
		public void ����ʩ��(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��)
		{
			super.����ʩ��(�з�����, �ͷŴ˼��ܵ�Ӣ��);
			���м�����.ʩ��(�з�����, �ͷŴ˼��ܵ�Ӣ��);
		}
		@Override
		public String get״̬����()
		{
			return "���м��ܳ���ʩ��";
		}
	}
	private static class ����ֵ����״̬�� extends ״̬��
	{
		public ����ֵ����״̬��()
		{
			super(����ֵ���ͳ����غ���);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��)
		{
			��״̬����Ӣ��.�������ֵ�ٷֱȱ仯(-����ֵ���Ͱٷֱ�);
		}
		@Override
		public String get״̬����()
		{
			return "���м������е��ˣ�������������ֵ����";
		}
	}
	public ���м�����()
	{
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private static class �ͷ������� extends ������
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
	private static class �ͷŶ����� extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(1.9f);
		private Image ��;
		private Music ��Ч;
		private �ͷŶ�����(float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
		{
			�� = new Image(Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getRegion("SkillE"));
			ͼ�������.������Ա��������ָ������(��, 250);
			��.setOrigin(��.getWidth() / 2, 0);
			RotateByAction ��תAction = Actions.rotateBy(120, 0.1f);
			RepeatAction ������תAction = Actions.forever(��תAction);
			��.addAction(new ParallelAction(������תAction, �ӳ�));
			��.setPosition(������X, ������Y);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "GarenSkillE.mp3"));
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		}
		public boolean is���()
		{
			if (�ӳ�.isAction�ѽ���())
			{
				��.remove();
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
			��ս��Ļ��.ʵ��.�����Ա(��);
			��Ч.play();
		}
	}
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��)
	{
		���м�����.ʩ��(�з�����, �ͷŴ˼��ܵ�Ӣ��);
		�ͷŴ˼��ܵ�Ӣ��.������������ʩ��״̬(new ������������ʩ��״̬��());
		return true;
	}
	private static void ʩ��(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��)
	{
		boolean is���� = ������.����_����_�����Ƿ���(�ͷŴ˼��ܵ�Ӣ��.get��ս�б�������());
		int �˺�ֵ = (int) (�ͷŴ˼��ܵ�Ӣ��.get��ս�й�����() * ���ܸ����˺���ռ�������ٷֱ� + ���ܻ����˺�);
		���������� �������� = new ����������();
		if (is����)
		{
			��������.�������(new ״̬�ı���ʾ������(�ͷŴ˼��ܵ�Ӣ��.is�ҷ�(), �ͷŴ˼��ܵ�Ӣ��.getӢ������λ��(), "����", true));
			�˺�ֵ *= 2;
		}
		int ��������˺� = 0;
		int ��ֵ��͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ���״�͸();
		float �ٷֱȴ�͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȻ��״�͸();
		if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
		{
			��������.�������(new �ͷ�������(��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		else
		{
			��������.�������(new �ͷ�������(��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		for (��ս��Ӣ���� �з�Ӣ�� : �з�����.getĬ�ϱ�����С��ΧӢ������(�ͷŴ˼��ܵ�Ӣ��))
		{
			if (�з�Ӣ�� != null && !�з�Ӣ��.is����())
			{
				if (������.����_����_�����Ƿ���(������))
				{
					��������˺� += �з�Ӣ��.����������˺�(�ͷŴ˼��ܵ�Ӣ��, �˺�ֵ, ��ֵ��͸, �ٷֱȴ�͸, ��������);
				}
			}
		}
		״̬�� ����ֵ����״̬ = �ͷŴ˼��ܵ�Ӣ��.get����ֵ����״̬(����ֵ����״̬��.class); 
		if (����ֵ����״̬ != null)
		{
			��������.�������(new ״̬�ı���ʾ������(�ͷŴ˼��ܵ�Ӣ��.is�ҷ�(), �ͷŴ˼��ܵ�Ӣ��.getӢ������λ��(), "����ֵ��", false));
			����ֵ����״̬.����״̬�غ���();
		}
		else
		{
			�ͷŴ˼��ܵ�Ӣ��.�������ֵ����״̬(new ����ֵ����״̬��());
		}
		�ͷŴ˼��ܵ�Ӣ��.������Ѫ(��������˺�, true);
		������װ����.ʵ��.�������(��������);
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