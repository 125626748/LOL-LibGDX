package edu.bjfu.lol.Ӣ��.��������;

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
import edu.bjfu.lol.��̬.��ս��Ӣ����.����ֵ����״̬��;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.�߼�.������;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ���������׼����� extends ������ {

	private static final int ��һ���ͷŻغ��� = 2;
	private static final int �ͷż���غ��� = 12;
	private static final int �����˺� = 120;
	private static final float �����˺���ռ����ǿ�ȱ��� = 1;
	private static final float ������ = 50f / 100;
	private static final int �����غ��� = 1;
	private static final String ������ = "����������";
	private static final String �������� = String.format("%s  ���˿��з����С��Χ�ӳ�3��ȼ�յ�,��ը�Ե������\n%d(+%.0f����ǿ��)ħ���˺�,����ʹ����������ԭ������ֵ����,������\n%.0f%%,����%d�غ�.", 
			������, �����˺�, �����˺���ռ����ǿ�ȱ���, ������ * 100, �����غ���);
	private static class ����״̬�� extends ����ֵ����״̬��
	{
		public ����״̬��()
		{
			super(�����غ���);
		}
		@Override
		public String get״̬����()
		{
			return "���������ף�����ֵ����";
		}
	}
	public ���������׼�����() {
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class �ͷ������� extends ������
	{
		private float ������X;
		private float ������Y;
		private String Ӣ��Ƥ���ļ���;
		private boolean is������Ч;
		public �ͷ�������(float ������x, float ������y, String Ӣ��Ƥ���ļ���, boolean is������Ч)
		{
			������X = ������x;
			������Y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
			this.is������Ч = is������Ч;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �ͷŶ�����(������X, ������Y, Ӣ��Ƥ���ļ���, is������Ч);
		}
	}
	private class �ͷŶ����� extends ������
	{
		private �ӳ�Action �ӳ�;
		private ������Ա�� ����;
		private Music ��Ч; 
		public �ͷŶ�����(float ������X, float ������Y, String Ӣ��Ƥ���ļ���, boolean is������Ч)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "JinxSkillE.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			�ӳ� = new �ӳ�Action(0.6f);
			����.addAction(�ӳ�);
			if (is������Ч)
			{
				��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "JinxSkillE.mp3"));
				��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
			}
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
			if (��Ч != null)
			{
				��Ч.play();
			}
		}
	}
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��)
	{
		int �����˺� = (int) (�����˺� + �����˺���ռ����ǿ�ȱ��� * �ͷŴ˼��ܵ�Ӣ��.get��ս�з���ǿ��());
		boolean is���� = false;
		int ���˺� = 0;
		int ��ֵ��͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ������͸();
		float �ٷֱȴ�͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȷ�����͸();
		���������� �������� = new ����������();
		for (��ս��Ӣ���� ���� : �з�����.get���������С��ΧӢ������())
		{
			if (���� != null && !����.is����())
			{
				if (������.����_����_�����Ƿ���(������))
				{
					if (����.is�ҷ�())
					{
						��������.�������(new �ͷ�������(
								��ս��Ļ��.�ҷ�X��������[����.getӢ������λ��() - 1],
								��ս��Ļ��.�ҷ�Y��������[����.getӢ������λ��() - 1],
								�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(),
								!is����));
					}
					else
					{
						��������.�������(new �ͷ�������(
								��ս��Ļ��.�з�X��������[����.getӢ������λ��() - 1],
								��ս��Ļ��.�з�Y��������[����.getӢ������λ��() - 1],
								�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(),
								!is����));
					}
					is���� = true;
					��������.�������(new ״̬�ı���ʾ������(����.is�ҷ�(), ����.getӢ������λ��(), "����ֵ����", false));
					����.�������ֵ����״̬(new ����״̬��());
					���˺� += ����.�����ħ���˺�(�ͷŴ˼��ܵ�Ӣ��, �����˺�, ��ֵ��͸, �ٷֱȴ�͸, ��������);
				}
			}
		}
		������װ����.ʵ��.�������(��������);
		if (is����)
		{
			�ͷŴ˼��ܵ�Ӣ��.������Ѫ(���˺�, true);
		}
		return true;
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
		return "D";
	}
}
