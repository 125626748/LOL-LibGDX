package edu.bjfu.lol.Ӣ��.Ƥ��Ů��;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;

import edu.bjfu.lol.scenes.scene2d.actions.�ӳ�Action;
import edu.bjfu.lol.scenes.scene2d.actions.����ƶ�Action;
import edu.bjfu.lol.scenes.scene2d.ui.������Ա��;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.����������;
import edu.bjfu.lol.screen.��ս��Ļ��;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ��ƽʹ�߼����� extends ������ {

	private static final int ��һ���ͷŻغ��� = 1;
	private static final int �ͷż���غ��� = 5;
	private static final int ���ܻ����˺� = 20;
	private static final float ���ܸ����˺���ռ���������� = 1.3f;
	private static final float �˺����εݼ��ٷֱ� = 10f / 100;
	private static final String ������ = "��ƽʹ��";
	private static final String �������� = String.format("%s  �����ռ���ת����ǹ���д�͸���,��Ŀ�����%d(+%.1f����\n��)�����˺�.��Ŀ�����Ŀ����˺����εݼ�%.0f%%.",
			������
			,���ܻ����˺�, ���ܸ����˺���ռ����������, �˺����εݼ��ٷֱ� * 100);
	public ��ƽʹ�߼�����() {
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
		private ����ƶ�Action �ƶ�Action;
		private ������Ա�� ����;
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
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "CaitlynSkillQ.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			����Ч��.findEmitter("Untitled").getRotation().setHigh((float) Ŀ��Ƕ� - 90);
			���� = new ������Ա��(����Ч��);
			����.setPosition(������x, ������y);
			double ���� = Ŀ��Ƕ� / 180 * Math.PI;
			float ���Ŀ��X = (float) (��� * Math.cos(����));
			float ���Ŀ��Y = (float) (��� * Math.sin(����));
			�ӳ�Action �ӳ� = new �ӳ�Action(0.18f);
			�ƶ�Action = new ����ƶ�Action(���Ŀ��X, ���Ŀ��Y, 0.5f);
			����.addAction(Actions.sequence(�ӳ�, �ƶ�Action));
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "CaitlynSkillQ.mp3"));
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
		int �����˺� = (int) (�ͷŴ˼��ܵ�Ӣ��.get��ս�й�����() * ���ܸ����˺���ռ���������� + ���ܻ����˺�);
		int �����˺� = 0;
		int ֮ǰ���и��� = 0;
		int ��ֵ��͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ���״�͸();
		float �ٷֱȴ�͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȻ��״�͸();
		���������� �������� = new ����������();
		float ������x = 0;
		float ������y = 0;
		int ���������� = 0;
		for (��ս��Ӣ���� ���� : �з�����.get���ű�����Ӣ������(�ͷŴ˼��ܵ�Ӣ��))
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
				�����˺� += ����.����������˺�(�ͷŴ˼��ܵ�Ӣ��, (int) (�����˺� * (1 - ֮ǰ���и��� * �˺����εݼ��ٷֱ�)), ��ֵ��͸, �ٷֱȴ�͸, ��������);
				֮ǰ���и���++;
			}
		}
		������x /= ����������;
		������y /= ����������;
		if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
		{
			��������.�������(new �ͷ�������(��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ������x, ������y, �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		else
		{
			��������.�������(new �ͷ�������(��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1], ������x, ������y, �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		������װ����.ʵ��.�������(��������);
		if (֮ǰ���и��� > 0)
		{
			�ͷŴ˼��ܵ�Ӣ��.������Ѫ(�����˺�, true);
		}
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
		return "B";
	}
}
