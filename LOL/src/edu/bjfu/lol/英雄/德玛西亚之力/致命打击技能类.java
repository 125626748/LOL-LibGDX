package edu.bjfu.lol.Ӣ��.��������֮��;

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
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ������������� extends ������ {
	private static final int ��һ���ͷŻغ��� = 1;
	private static final int �ͷż���غ��� = 6;
	private static final float ����ֵ�����ٷֱ� = 15f / 100;
	private static final int ����ֵ���������غ��� = 2;
	private static final int �´ι�������˺�״̬�����غ��� = 2;
	private static final int �´ι�������˺�����ֵ = 30;
	private static final float �´ι�������˺������˺���ռ���������� = 1.4f;
	private static final int ��Ĭ�����غ��� = 1;
	private static final String ������ = "�������";
	private static final String �������� = String.format("%s  ��������%.0f%%������ֵ,����%d�غ�,�ڽ�������%d�غ���,����\n�´���ͨ���������%d(+%.1f������)�����˺�,����ĬĿ��%d�غ�.",
			������
			,����ֵ�����ٷֱ� * 100, ����ֵ���������غ���, �´ι�������˺�״̬�����غ���, �´ι�������˺�����ֵ, �´ι�������˺������˺���ռ����������, ��Ĭ�����غ���);
	private static class ����ֵ����״̬�� extends ״̬��
	{
		public ����ֵ����״̬��() {
			super(����ֵ���������غ���);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��) {
			��״̬����Ӣ��.�������ֵ�ٷֱȱ仯(����ֵ�����ٷֱ�);
		}
		@Override
		public String get״̬����() {
			return "�����������������ֵ";
		}	
	}
	protected static class ��һ�ι�����ɶ����˺�״̬�� extends ��ͨ��������Ч��״̬��
	{
		public ��һ�ι�����ɶ����˺�״̬��() {
			super(�´ι�������˺�״̬�����غ���);
		}
		@Override
		public void ��ͨ����(��ս��Ӣ���� ������, ��ս��Ӣ���� ��������, Iterator<��ͨ��������Ч��״̬��> ������) {
			Gdx.app.debug("�������������.��һ�ι�����ɶ����˺�״̬��.��ͨ����", String.format("%s���������ͨ����Ч����������Ĭ%s����ɶ����˺�\n", ������.get����������λ��Ӣ������(), ��������.get����������λ��Ӣ������()));
			���������� �������� = new ����������();
			��������.����Ĭ(��Ĭ�����غ���, ��������);
			int ��ɵ��˺� = ��������.����������˺�(������, (int)(������.get��ս�й�����() * �´ι�������˺������˺���ռ����������) + �´ι�������˺�����ֵ, ������.get��ս����ֵ���״�͸(), ������.get��ս�аٷֱȻ��״�͸(), ��������);
			������װ����.ʵ��.�������(��������);
			������.������Ѫ(��ɵ��˺�, false);
			������.remove();
		}
		@Override
		public String get״̬����() {
			return "����������´ι�����ɶ��������˺�������ĬĿ��";
		}
	}
	public �������������() {
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��) {
		���������� �������� = new ����������();
		if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
		{
			��������.�������(new �����������������(��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		else
		{
			��������.�������(new �����������������(��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));	
		}
		�ͷŴ˼��ܵ�Ӣ��.�������ֵ����״̬(new ����ֵ����״̬��());
		��������.�������(new ״̬�ı���ʾ������(�ͷŴ˼��ܵ�Ӣ��.is�ҷ�(), �ͷŴ˼��ܵ�Ӣ��.getӢ������λ��(), "����ֵ��,�´��չ���ĬĿ��", true));
		������װ����.ʵ��.�������(��������);
		�ͷŴ˼��ܵ�Ӣ��.�����ͨ��������Ч��״̬(new ��һ�ι�����ɶ����˺�״̬��());
		return true;
	}
	private class ����������������� extends ������
	{
		private float ������X;
		private float ������Y;
		private String Ӣ��Ƥ���ļ���;
		public �����������������(float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			������X = ������x;
			������Y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �����������������(������X, ������Y, Ӣ��Ƥ���ļ���);
		}
	}
	private class ����������������� extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(0.6f);
		private ������Ա�� ����;
		private Music ��Ч;
		private �����������������(float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "GarenSkillQ.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			����.addAction(�ӳ�);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "GarenSkillQ.mp3"));
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
		return "B";
	}
}
