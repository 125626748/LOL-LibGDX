package edu.bjfu.lol.Ӣ��.а��С��ʦ;

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
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class �ڰ����뼼���� extends ������ {

	private static final int ��һ���ͷŻغ��� = 1;
	private static final int �ͷż���غ��� = 4;
	private static final int �����˺� = 80;
	private static final float �����˺���ռ����ǿ�ȱ��� = 0.6f;
	private static final int ����ǿ������ֵ = 5;
	private static final String ������ = "�ڰ�����";
	private static final String �������� = String.format("%s  ά���ͷźڰ������������,���%d(+%.1f����ǿ��)ħ���˺�,\n���ɱ��һ����λ,ά�ȵķ���ǿ������%d��.", 
			������
			,�����˺�, �����˺���ռ����ǿ�ȱ���, ����ǿ������ֵ);
	private static class ���ӷ�ǿ״̬�� extends ״̬��
	{
		public ���ӷ�ǿ״̬��()
		{
			super(Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��)
		{
			��״̬����Ӣ��.��ӷ���ǿ����ֵ�仯(����ǿ������ֵ * get��ǰ����());
		}
		@Override
		public String get״̬����()
		{
			return "�ڰ����뱻����ɱ���з�Ӣ�ۣ����ӷ�ǿ";
		}
	}
	public �ڰ����뼼����() {
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class �ͷ������� extends ������
	{
		private int ������X;
		private int ������Y;
		private int ������X;
		private int ������Y;
		private String Ӣ��Ƥ���ļ���;
		public �ͷ�������(int ������x, int ������y, int ������x, int ������y, String Ӣ��Ƥ���ļ���)
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
		private Music ��Ч;
		private �ͷŶ�����(int ������X, int ������Y, int ������X, int ������Y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "VeigarSkillQ.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			�ƶ�Action = new �����ƶ�Action(������X, ������Y, 0.45f);
			����.addAction(�ƶ�Action);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "VeigarSkillQ.mp3"));
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
		��ս��Ӣ���� ���� = �з�����.getĬ�ϱ�����Ӣ��(�ͷŴ˼��ܵ�Ӣ��);
		if (���� != null)
		{
			if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
			{
				������װ����.ʵ��.�������(new �ͷ�������(
						��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�з�X��������[����.getӢ������λ��() - 1],
						��ս��Ļ��.�з�Y��������[����.getӢ������λ��() - 1], 
						�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
			}
			else
			{
				������װ����.ʵ��.�������(new �ͷ�������(
						��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�ҷ�X��������[����.getӢ������λ��() - 1],
						��ս��Ļ��.�ҷ�Y��������[����.getӢ������λ��() - 1], 
						�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
			}
			���������� �������� = new ����������();
			int ����˺� = ����.�����ħ���˺�(�ͷŴ˼��ܵ�Ӣ��, (int) (�����˺� + �����˺���ռ����ǿ�ȱ��� * �ͷŴ˼��ܵ�Ӣ��.get��ս�з���ǿ��()), �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ������͸(), �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȷ�����͸(), ��������);
			�ͷŴ˼��ܵ�Ӣ��.������Ѫ(����˺�, false);
			if (����.is����())
			{
				��������.�������(new ״̬�ı���ʾ������(�ͷŴ˼��ܵ�Ӣ��.is�ҷ�(), �ͷŴ˼��ܵ�Ӣ��.getӢ������λ��(), "��ǿ��", true));
				�ͷŴ˼��ܵ�Ӣ��.get����ǿ������״̬(���ӷ�ǿ״̬��.class).����һ��(false);
			}
			������װ����.ʵ��.�������(��������);
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
	public void ��ӱ���״̬(��ս��Ӣ���� ��ս��Ӣ��)
	{
		��ս��Ӣ��.��ӷ���ǿ������״̬(new ���ӷ�ǿ״̬��());
	}
	@Override
	public String get�����ļ���׺()
	{
		return "A";
	}
}
