package edu.bjfu.lol.Ӣ��.����֮��;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;

import edu.bjfu.lol.scenes.scene2d.actions.����ƶ�Action;
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
import edu.bjfu.lol.Ӣ��.����֮��.����֮�м�����.����֮��״̬��;
import edu.bjfu.lol.�߼�.������;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ����֮�漼���� extends ������ {

	private static final int ��һ���ͷŻغ��� = 3;
	private static final int �ͷż���غ��� = 15;
	private static final int �������ӳ����غ��� = 7;
	private static final float �����ӳɰٷֱ� = 20f / 100;
	private static final int ��ͻ����˺� = 80;
	private static final int ��߻����˺� = 240;
	private static final float ��͸����˺���ռ���������� = 0.6f;
	private static final float ��߸����˺���ռ���������� = 1.8f;
	private static final float ������ = 50f / 100;
	private static final String ������ = "����֮��";
	private static final String �������� = String.format("%s  ����������������ʥ�������,��%d�غϳ���ʱ���������%.0f%%\n�������ӳ�,���ӳ�һ��������,�Եз�ȫ�����%d(+%.1f������)��%d\n(+%.1f������)�����˺�,��������Խ��,��ü����˺�Խ�ߣ�������%.0f%%.", 
			������, 
			�������ӳ����غ���, �����ӳɰٷֱ� * 100,
			��ͻ����˺�, ��͸����˺���ռ����������, 
			��߻����˺�, ��߸����˺���ռ����������, 
			������ * 100);
	private static class ����������״̬�� extends ״̬��
	{
		public ����������״̬��() {
			super(�������ӳ����غ���);
		}
		@Override
		public void ����(��ս��Ӣ���� ��״̬����Ӣ��) {
			��״̬����Ӣ��.��ӹ������ٷֱȱ仯(�����ӳɰٷֱ�);
		}
		@Override
		public String get״̬����() {
			return "����֮�棬����������";
		}
	}
	public ����֮�漼����() {
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
		private ����ƶ�Action[] �ƶ�Action����;
		private ������Ա��[] �������� = new ������Ա��[3];
		private Music ��Ч;
		public �ͷŶ�����(float ������x, float ������y, float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			// ���Ŀ��
			double ��� = Math.sqrt((������y - ������y) * (������y - ������y) + (������x - ������x) * (������x - ������x)) * 2;
			double Ŀ��Ƕ� = Math.atan((������y - ������y) / (������x - ������x)) / Math.PI * 180;
			if (������x < ������x)
			{
				Ŀ��Ƕ� += 180;
			}
			int �м��±� = ��������.length / 2;
			�ƶ�Action���� = new ����ƶ�Action[��������.length];
			ParticleEffect[] ����Ч������ = new ParticleEffect[��������.length];
			for (int i = 0; i < ��������.length; i++)
			{
				����Ч������[i] = new ParticleEffect();
				����Ч������[i].load(Gdx.files.internal(������.����Ŀ¼ + "RivenSkillR.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
				��������[i] = new ������Ա��(����Ч������[i]);
				��������[i].setPosition(������x, ������y);
				double �Ƕ� = Ŀ��Ƕ� - (i - �м��±�) * 10;
				����Ч������[i].findEmitter("Untitled").getRotation().setHigh((float) �Ƕ� - 90);
				double ���� = �Ƕ� / 180 * Math.PI;
				float ���Ŀ��X = (float) (��� * Math.cos(����));
				float ���Ŀ��Y = (float) (��� * Math.sin(����));
				�ƶ�Action����[i] = new ����ƶ�Action(���Ŀ��X, ���Ŀ��Y, 0.5f);
				��������[i].addAction(�ƶ�Action����[i]);
			}
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "RivenSkillR.mp3"));
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		}
		@Override
		public boolean is���()
		{
			if (�ƶ�Action����[0].isAction�ѽ���())
			{
				for (������Ա�� ���� : ��������)
				{
					����.remove();
					����.dispose();
				}
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
			for (������Ա�� ���� : ��������)
			{
				��ս��Ļ��.ʵ��.�����Ա(����);
			}
			��Ч.play();
		}
	}
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��) {
		���������� �������� = new ����������();
		��������.�������(new ״̬�ı���ʾ������(�ͷŴ˼��ܵ�Ӣ��.is�ҷ�(), �ͷŴ˼��ܵ�Ӣ��.getӢ������λ��(), "��������", true));
		�ͷŴ˼��ܵ�Ӣ��.��ӹ���������״̬(new ����������״̬��());
		int ������ = �ͷŴ˼��ܵ�Ӣ��.get��ս�й�����();
		int ����˺� = (int) (��ͻ����˺� + ��͸����˺���ռ���������� * ������);
		int ����˺� = (int) (��߻����˺� + ��߸����˺���ռ���������� * ������);
		int ���˺� = 0;
		boolean is���� = false;
		int ��ֵ��͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ���״�͸();
		float �ٷֱȴ�͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȻ��״�͸();
		float ������x = 0;
		float ������y = 0;
		int ���������� = 0;
		for (��ս��Ӣ���� ���� : �з�����.get��ս��Ӣ������())
		{
			if (���� != null && !����.is����())
			{
				����������++;
				if (����.is�ҷ�())
				{
					������x += ��ս��Ļ��.�ҷ�X��������[����.getӢ������λ��()-1];
					������y += ��ս��Ļ��.�ҷ�Y��������[����.getӢ������λ��()-1];
				}
				else
				{
					������x += ��ս��Ļ��.�з�X��������[����.getӢ������λ��()-1];
					������y += ��ս��Ļ��.�з�Y��������[����.getӢ������λ��()-1];
				}
				if (������.����_����_�����Ƿ���(������))
				{
					int �������ֵ = ����.get��ս���������ֵ();
					float ʧȥ����ֵ���� = (�������ֵ - ����.get��ս������ֵ()) / �������ֵ;
					���˺� += ����.����������˺�(�ͷŴ˼��ܵ�Ӣ��, ������.����_���ֵ_���ֵ_�ٷֱ�_����ֵ(����˺�, ����˺�, ʧȥ����ֵ����), ��ֵ��͸, �ٷֱȴ�͸, ��������);
					is���� = true;
				}
			}
		}
		������x /= ����������;
		������y /= ����������;
		if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
		{
			������װ����.ʵ��.�������(new �ͷ�������(��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ������x, ������y, �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		else
		{
			������װ����.ʵ��.�������(new �ͷ�������(��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ������x, ������y, �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		������װ����.ʵ��.�������(��������);
		if (is����)
		{
			����֮��״̬��.��֪ͨ�������д���(1,�ͷŴ˼��ܵ�Ӣ��);
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
		return "E";
	}
	@Override
	public boolean is����()
	{
		return true;
	}
}
