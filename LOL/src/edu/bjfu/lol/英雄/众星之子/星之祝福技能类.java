package edu.bjfu.lol.Ӣ��.����֮��;

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
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ��֮ף�������� extends ������ {
	private static final int ��һ���ͷŻغ��� = 2;
	private static final int �ͷż���غ��� = 10;
	private static final int ���ܻ����ظ�ֵ = 70;
	private static final float ���ܸ��ӻظ�ֵ��ռ����ǿ�ȱ��� = 0.45f;
	private static final int ���ӻ���ֵ = 25;
	private static final int �������ӳ����غ��� = 2;
	private static final String ������ = "��֮ף��";
	private static final String �������� = String.format("%s  ������ף��һ���������ص��ѷ���λ,ΪĿ��ظ�%d(+%.2f��\n��ǿ��)������ֵ,����ʱ����Ŀ��%d�㻤��,����Ч������%d�غ�.",
			������
			,���ܻ����ظ�ֵ, ���ܸ��ӻظ�ֵ��ռ����ǿ�ȱ���, ���ӻ���ֵ, �������ӳ����غ���);
	private static class ��������״̬�� extends ״̬��
	{
		public ��������״̬��() {
			super(�������ӳ����غ���);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��) {
			��״̬����Ӣ��.��ӻ�����ֵ�仯(���ӻ���ֵ);
		}
		@Override
		public String get״̬����() {
			return "��֮ף�������ӻ���";
		}
	}
	public ��֮ף��������() {
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
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "SorakaSkillW.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			����.addAction(�ӳ�);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "SorakaSkillW.mp3"));
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
		��ս��Ӣ���� ��������Ӣ�� = �ͷŴ˼��ܵ�Ӣ��.get��������().get��������Ӣ��(true);
		���������� �������� = new ����������();
		��������.�������(new ״̬�ı���ʾ������(�ͷŴ˼��ܵ�Ӣ��.is�ҷ�(), �ͷŴ˼��ܵ�Ӣ��.getӢ������λ��(), "���ס�", true));
		if (��������Ӣ��.is�ҷ�())
		{
			��������.�������(new �ͷ�������(��ս��Ļ��.�ҷ�X��������[��������Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�ҷ�Y��������[��������Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		else
		{
			��������.�������(new �ͷ�������(��ս��Ļ��.�з�X��������[��������Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�з�Y��������[��������Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		��������Ӣ��.��������ֵ((int) (���ܻ����ظ�ֵ + ���ܸ��ӻظ�ֵ��ռ����ǿ�ȱ��� * �ͷŴ˼��ܵ�Ӣ��.get��ս�з���ǿ��()), ��������);
		������װ����.ʵ��.�������(��������);
		��������Ӣ��.��ӻ���ֵ����״̬(new ��������״̬��());
		return true;
	}
	@Override
	public String get��������() {
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
