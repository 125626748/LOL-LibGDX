package edu.bjfu.lol.Ӣ��.��������֮��;

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

class ���������� extends ������ {
	private static final int ��һ���ͷŻغ��� = 2;
	private static final int �ͷż���غ��� = 8;
	private static final int ����״̬�����غ��� = 2;
	private static final float ����ħ��������߰ٷֱ� = 20f / 100;
	private static final float ���˰ٷֱ� = 20f / 100;
	private static final String ������ = "����";
	private static final String �������� = String.format("%s ���������׵Ļ��׺�ħ���������%.0f%%.����,�����ڽ�������%d�غ���\nʩ��һ����������,���������˺�%.0f%%.",
			������
			,����ħ��������߰ٷֱ� * 100, ����״̬�����غ���, ���˰ٷֱ� * 100);
	private static class �������״̬�� extends ״̬��
	{
		public �������״̬��()
		{
			super(Integer.MAX_VALUE);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��)
		{
			��״̬����Ӣ��.��ӻ��װٷֱȱ仯(����ħ��������߰ٷֱ�);
		}
		@Override
		public String get״̬����()
		{
			return "���������������׵Ļ������";
		}
	}
	private static class ħ���������״̬�� extends ״̬��
	{
		public ħ���������״̬��()
		{
			super(Integer.MAX_VALUE);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��)
		{
			��״̬����Ӣ��.���ħ�����԰ٷֱȱ仯(����ħ��������߰ٷֱ�);
		}
		@Override
		public String get״̬����()
		{
			return "���������������׵�ħ���������";
		}
	}
	private static class �˺�����״̬ extends ״̬��
	{
		public �˺�����״̬() {
			super(����״̬�����غ���);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��) {
			��״̬����Ӣ��.����˺��ٷֱȼ���(���˰ٷֱ�);
		}
		@Override
		public String get״̬����() {
			return "���������������˺�";
		}
	}
	public ����������() {
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	@Override
	public void ��ӱ���״̬(��ս��Ӣ���� ��ս��Ӣ��)
	{
		��ս��Ӣ��.��ӻ���ֵ����״̬(new �������״̬��());
		��ս��Ӣ��.���ħ����������״̬(new ħ���������״̬��());
	}
	private class �ͷ����������� extends ������
	{
		private float ������X;
		private float ������Y;
		private String Ӣ��Ƥ���ļ���;
		public �ͷ�����������(float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			������X = ������x;
			������Y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �ͷ�����������(������X, ������Y, Ӣ��Ƥ���ļ���);
		}
	}
	private class �ͷ����������� extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(0.85f);
		private ������Ա�� ����;
		private Music ��Ч;
		private �ͷ�����������(float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "GarenSkillW.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			����.addAction(�ӳ�);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "GarenSkillW.mp3"));
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
		��������.�������(new ״̬�ı���ʾ������(�ͷŴ˼��ܵ�Ӣ��.is�ҷ�(), �ͷŴ˼��ܵ�Ӣ��.getӢ������λ��(), "�˺�����", true));
		if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
		{
			��������.�������(new �ͷ�����������(��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		else
		{
			��������.�������(new �ͷ�����������(��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		������װ����.ʵ��.�������(��������);
		�ͷŴ˼��ܵ�Ӣ��.����˺�����״̬(new �˺�����״̬());
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
