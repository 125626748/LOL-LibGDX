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
import edu.bjfu.lol.��̬.��ս��Ӣ����.����ͨ��������Ч��״̬��;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ��̷��������� extends ������ {

	private static final int ��һ���ͷŻغ��� = 1;
	private static final int �ͷż���غ��� = 7;
	private static final int �����غ��� = 3;
	private static final int ����ħ�����ֵ = 40;
	private static final int ���������˺� = 15;
	private static final float ���������˺���ռ���ױ��� = 0.1f;
	private static final String ������ = "��̷���";
	private static final String �������� = String.format("%s  ��Ī˹�������״̬,����%d�غ�,���%d���׺�ħ�����Բ���\n��ͨ����ʱ����%d(+%.1f����ֵ)ħ���˺���������.", 
			������
			,�����غ���, ����ħ�����ֵ, ���������˺�, ���������˺���ռ���ױ���);
	private static class �������״̬�� extends ״̬��
	{
		public �������״̬��() {
			super(�����غ���);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��) {
			��״̬����Ӣ��.��ӻ�����ֵ�仯(����ħ�����ֵ);
		}
		@Override
		public String get״̬����() {
			return "��̷�������߻���";
		}
	}
	private static class ħ�����״̬�� extends ״̬��
	{
		public ħ�����״̬��() {
			super(�����غ���);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��) {
			��״̬����Ӣ��.���ħ��������ֵ�仯(����ħ�����ֵ);
		}
		@Override
		public String get״̬����() {
			return "��̷��������ħ������";
		}
	}
	private static class �����������˺�״̬�� extends ����ͨ��������Ч��״̬��
	{
		public �����������˺�״̬��() {
			super(�����غ���);
		}
		@Override
		public void ����ͨ����(��ս��Ӣ���� ������, ��ս��Ӣ���� ��������) {
			���������� �������� = new ����������();
			��������.�������(new ״̬�ı���ʾ������(��������.is�ҷ�(), ��������.getӢ������λ��(), "��������", false));
			������.�����ħ���˺�(������, (int) (���������˺� + ���������˺���ռ���ױ��� * ��������.get��ս�л���ֵ()), ��������.get��ս����ֵ������͸(), ��������.get��ս�аٷֱȷ�����͸(), ��������);
			������װ����.ʵ��.�������(��������);
		}
		@Override
		public String get״̬����() {
			return "��̷���������ͨ���������˺�";
		}
	}
	public ��̷���������() {
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
		private �ӳ�Action �ӳ� = new �ӳ�Action(0.85f);
		private ������Ա�� ����;
		private Music ��Ч;
		private �ͷŶ�����(float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "RammusSkillW.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			����.addAction(�ӳ�);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "RammusSkillW.mp3"));
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
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��) {
		���������� �������� = new ����������();
		��������.�������(new ״̬�ı���ʾ������(�ͷŴ˼��ܵ�Ӣ��.is�ҷ�(), �ͷŴ˼��ܵ�Ӣ��.getӢ������λ��(), "˫����,��������", true));
		if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
		{
			��������.�������(new �ͷ�������(��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		else
		{
			��������.�������(new �ͷ�������(��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		������װ����.ʵ��.�������(��������);
		�ͷŴ˼��ܵ�Ӣ��.��ӻ���ֵ����״̬(new �������״̬��());
		�ͷŴ˼��ܵ�Ӣ��.���ħ����������״̬(new ħ�����״̬��());
		�ͷŴ˼��ܵ�Ӣ��.��ӱ���ͨ��������Ч��״̬(new �����������˺�״̬��());
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
		return "C";
	}
}
