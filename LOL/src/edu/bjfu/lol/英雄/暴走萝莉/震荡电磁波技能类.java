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
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��Ӣ����.����״̬��;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.��̬.״̬��;
import edu.bjfu.lol.�߼�.������;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class �𵴵�Ų������� extends ������ {

	private static final int ��һ���ͷŻغ��� = 2;
	private static final int �ͷż���غ��� = 5;
	private static final int �����˺� = 30;
	private static final float �����˺���ռ���������� = 1.4f;
	private static final float ����ֵ���ٰٷֱ� = 30f / 100;
	private static final int �����غ��� = 1;
	private static final float ������ = 70f / 100;
	private static final String ������ = "�𵴵�Ų�";
	private static final String �������� = String.format("%s  ���˿ʹ����������ǹ\"�����\"�������Ŀ�귢����\n��,�������%d(+%.1f������)�������˺�,��ʾ�õ�λ����������ֵ%.0f%%,\n����%d�غ�,������%.0f%%.", 
			������, �����˺�, �����˺���ռ����������, ����ֵ���ٰٷֱ� * 100, �����غ���, ������ * 100);
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
			return "�𵴵�Ų�����������ֵ";
		}
	}
	private static class ��¶״̬�� extends ����״̬��
	{
		public ��¶״̬��() {
			super(�����غ���);
		}
		@Override
		public String get״̬����() {
			return "�𵴵�Ų�������¶";
		}
	}
	public �𵴵�Ų�������() {
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class �ͷ������� extends ������
	{
		private float ������x;
		private float ������y;
		private float ������x;
		private float ������y;
		private String Ӣ��Ƥ���ļ���;
		public �ͷ�������(float ������x, float ������y, float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			this.������x = ������x;
			this.������y = ������y;
			this.������x = ������x;
			this.������y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �ͷŶ�����(������x, ������y, ������x, ������y, Ӣ��Ƥ���ļ���);
		}
	}
	private class �ͷŶ����� extends ������
	{
		private �����ƶ�Action �ƶ�Action;
		private ������Ա�� ����;
		private Music ��Ч;
		public �ͷŶ�����(float ������x, float ������y, float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "JinxSkillW.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			float �Ƕ� = (float)(Math.atan((������y-������y)/(������x-������x)) / Math.PI * 180) - 90;
			if (������x < ������x)
			{
				�Ƕ� += 180;
			}
			����Ч��.findEmitter("Untitled").getRotation().setHigh(�Ƕ�);
			���� = new ������Ա��(����Ч��);
			����.setPosition(������x, ������y);
			�ƶ�Action = new �����ƶ�Action(������x, ������y, 0.5f);
			����.addAction(�ƶ�Action);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "JinxSkillW.mp3"));
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
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��) {
		��ս��Ӣ���� ���� = �з�����.get���������Ӣ��(true);
		if (������.����_����_�����Ƿ���(������))
		{
			���������� �������� = new ����������();
			��������.�������(new ״̬�ı���ʾ������(����.is�ҷ�(), ����.getӢ������λ��(), "��¶,����ֵ��", false));
			if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
			{
				��������.�������(new �ͷ�������(
						��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�з�X��������[����.getӢ������λ��() - 1],
						��ս��Ļ��.�з�Y��������[����.getӢ������λ��() - 1],
						�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
			}
			else
			{
				��������.�������(new �ͷ�������(
						��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�ҷ�X��������[����.getӢ������λ��() - 1],
						��ս��Ļ��.�ҷ�Y��������[����.getӢ������λ��() - 1],
						�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
			}
			����.�������״̬(new ��¶״̬��(), ��������);
			����.�������ֵ����״̬(new ����ֵ����״̬��());
			int ����˺� = ����.����������˺�(�ͷŴ˼��ܵ�Ӣ��, (int) (�����˺� + �����˺���ռ���������� * �ͷŴ˼��ܵ�Ӣ��.get��ս�й�����()), �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ���״�͸(), �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȻ��״�͸(), ��������);
			�ͷŴ˼��ܵ�Ӣ��.������Ѫ(����˺�, false);
			������װ����.ʵ��.�������(��������);
		}
		else
		{
			if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
			{
				������װ����.ʵ��.�������(new �ͷ�������(
						��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						������.��Ļ�� / 2,
						������.��Ļ��,
						�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
			}
			else
			{
				������װ����.ʵ��.�������(new �ͷ�������(
						��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
						������.��Ļ�� / 2,
						0,
						�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
			}
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
		return "C";
	}
}
