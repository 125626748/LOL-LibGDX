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
import edu.bjfu.lol.screen.��ս��Ļ��.Ӣ��������;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.�߼�.������;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ������̼����� extends ������ {

	private static final int ��һ���ͷŻغ��� = 1;
	private static final int �ͷż���غ��� = 5;
	private static final int ���ܻ����˺� = 100;
	private static final float ���ܸ����˺���ռ���������� = 1;
	private static final float ����ֵ���ٰٷֱ� = 20f / 100;
	private static final float ������ = 80f / 100;
	private static final int �����غ��� = 1;
	private static final String ������ = "�������";
	private static final String �������� = String.format("%s  ��Ī˹������״���Ŀ��,��С��Χ�������%d(+%.0f������)\nħ���˺�,����������%.0f%%����ֵ,������%.0f%%,����%d�غ�.", 
			������
			,���ܻ����˺�, ���ܸ����˺���ռ����������, ����ֵ���ٰٷֱ� * 100, ������ * 100, �����غ���);
	private static class ����ֵ����״̬�� extends ״̬��
	{
		public ����ֵ����״̬��() {
			super(�����غ���);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��) {
			��״̬����Ӣ��.�������ֵ�ٷֱȱ仯(-����ֵ���ٰٷֱ�);
		}
		@Override
		public String get״̬����() {
			return "������̣���������ֵ";
		}
	}
	public ������̼�����() {
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class �ͷ������� extends ������
	{
		private boolean is�ҷ�;
		private int Ӣ������λ��;
		private float ������x;
		private float ������y;
		private float ������x;
		private float ������y;
		private String Ӣ��Ƥ���ļ���;
		public �ͷ�������(boolean is�ҷ�, int Ӣ������λ��, float ������x, float ������y, float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			this.is�ҷ� = is�ҷ�;
			this.Ӣ������λ�� = Ӣ������λ��;
			this.������x = ������x;
			this.������y = ������y;
			this.������x = ������x;
			this.������y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �ͷŶ�����(is�ҷ�, Ӣ������λ��, ������x, ������y, ������x, ������y, Ӣ��Ƥ���ļ���);
		}
	}
	private class �ͷŶ����� extends ������
	{
		private �����ƶ�Action �ƶ�Action;
		private ������Ա�� ����;
		private Music ��Ч;
		private Ӣ�������� Ӣ������;
		public �ͷŶ�����(boolean is�ҷ�, int Ӣ������λ��, float ������X, float ������Y, float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
		{
			this.Ӣ������ = ��ս��Ļ��.ʵ��.getӢ������(is�ҷ�, Ӣ������λ��);
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "RammusSkillQ.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			�ƶ�Action = new �����ƶ�Action(������X, ������Y, 0.7f);
			����.addAction(�ƶ�Action);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "RammusSkillQ.mp3"));
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		}
		@Override
		public boolean is���()
		{
			if (�ƶ�Action.isAction�ѽ���())
			{
				Ӣ������.setColor(1, 1, 1, 1);
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
			Ӣ������.setColor(1, 1, 1, 0);
			��Ч.play();
		}
	}
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��) {
		int �����˺� = (int) (���ܻ����˺� + ���ܸ����˺���ռ���������� * �ͷŴ˼��ܵ�Ӣ��.get��ս�й�����());
		int ����˺� = 0;
		boolean is���� = false;
		int ��ֵ��͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ������͸();
		float �ٷֱȴ�͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȷ�����͸();
		���������� �������� = new ����������();
		float ������x = 0;
		float ������y = 0;
		int ���������� = 0;
		for (��ս��Ӣ���� �з�Ӣ�� : �з�����.getĬ�ϱ�����С��ΧӢ������(�ͷŴ˼��ܵ�Ӣ��))
		{
			if (�з�Ӣ�� != null && !�з�Ӣ��.is����() && !�з�Ӣ��.is��ս������())
			{
				����������++;
				if (�з�Ӣ��.is�ҷ�())
				{
					������x += ��ս��Ļ��.�ҷ�X��������[�з�Ӣ��.getӢ������λ��()-1];
					������y += ��ս��Ļ��.�ҷ�Y��������[�з�Ӣ��.getӢ������λ��()-1];
				}
				else
				{
					������x += ��ս��Ļ��.�з�X��������[�з�Ӣ��.getӢ������λ��()-1];
					������y += ��ս��Ļ��.�з�Y��������[�з�Ӣ��.getӢ������λ��()-1];
				}
				if (������.����_����_�����Ƿ���(������))
				{
					��������.�������(new ״̬�ı���ʾ������(�з�Ӣ��.is�ҷ�(), �з�Ӣ��.getӢ������λ��(), "����ֵ��", false));
					�з�Ӣ��.�������ֵ����״̬(new ����ֵ����״̬��());
					����˺� += �з�Ӣ��.�����ħ���˺�(�ͷŴ˼��ܵ�Ӣ��, �����˺�, ��ֵ��͸, �ٷֱȴ�͸, ��������);
					is���� = true;
				}
			}
		}
		������x /= ����������;
		������y /= ����������;
		if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
		{
			������װ����.ʵ��.�������(new �ͷ�������(true, �ͷŴ˼��ܵ�Ӣ��.getӢ������λ��(), ��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ������x, ������y, �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		else
		{
			������װ����.ʵ��.�������(new �ͷ�������(false, �ͷŴ˼��ܵ�Ӣ��.getӢ������λ��(), ��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ������x, ������y, �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		������װ����.ʵ��.�������(��������);
		if (is����)
		{
			�ͷŴ˼��ܵ�Ӣ��.������Ѫ(����˺�, true);
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
		return "B";
	}
}
