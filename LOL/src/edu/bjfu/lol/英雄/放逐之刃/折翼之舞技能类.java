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
import edu.bjfu.lol.screen.��ս��Ļ��;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.Ӣ��.����֮��.����֮�м�����.����֮��״̬��;
import edu.bjfu.lol.�߼�.������;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ����֮�輼���� extends ������ {

	private static final int ��һ���ͷŻغ��� = 1;
	private static final int �ͷż���غ��� = 6;
	private static final int �����˺� = 30;
	private static final float �����˺���ռ���������� = 0.7f;
	private static final float ������ = 60f / 100;
	private static final int ���ɻغ��� = 1;
	private static final String ������ = "����֮��";
	private static final String �������� = String.format("%s  ��һ��:ն��,���%d(+%.1f������)�����˺�,�ڶ���:ն��,��\n��%d(+%.1f������)�����˺�,������:�ͻ�����,���%d(+%.1f������)����\n�˺�,����Χ�ĵ��˻���,������%.0f%%,���ɻغ���%d.", 
			������, 
			�����˺�, �����˺���ռ����������,
			�����˺�, �����˺���ռ����������,
			�����˺�, �����˺���ռ����������,
			������ * 100, ���ɻغ���);
	public ����֮�輼����() {
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
		private �ӳ�Action �ӳ� = new �ӳ�Action(0.25f);
		private ������Ա�� ����;
		private Music ��Ч;
		private �ͷŶ�����(float ������X, float ������Y, String Ӣ��Ƥ���ļ���, boolean is������Ч)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "RivenSkillQ.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			����.addAction(�ӳ�);
			if (is������Ч)
			{
				��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "RivenSkillQ.mp3"));
				��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
			}
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
			if (��Ч != null)
			{
				��Ч.play();
			}
		}
	}
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��) {
		��ս��Ӣ���� ѡ�е��� = �з�����.getĬ�ϱ�����Ӣ��(�ͷŴ˼��ܵ�Ӣ��);
		if (ѡ�е��� != null)
		{
			int ���˺� = 0;
			int �������д��� = 0;
			int ��ֵ��͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ���״�͸();
			float �ٷֱȴ�͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȻ��״�͸();
			int �����˺� = (int) (�����˺� + �����˺���ռ���������� * �ͷŴ˼��ܵ�Ӣ��.get��ս�й�����());
			for (int �ڼ��� = 1; �ڼ��� <= 3; �ڼ���++)
			{
				boolean is���� = false;
				���������� �������� = new ����������();
				if (ѡ�е���.is�ҷ�())
				{
					��������.�������(new �ͷ�������(��ս��Ļ��.�ҷ�X��������[ѡ�е���.getӢ������λ��() - 1], ��ս��Ļ��.�ҷ�Y��������[ѡ�е���.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(), �ڼ��� == 1));
				}
				else
				{
					��������.�������(new �ͷ�������(��ս��Ļ��.�з�X��������[ѡ�е���.getӢ������λ��() - 1], ��ս��Ļ��.�з�Y��������[ѡ�е���.getӢ������λ��() - 1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(), �ڼ��� == 1));
				}
				for (��ս��Ӣ���� ���� : �з�����.get������Ӣ������С��ΧӢ������(ѡ�е���))
				{
					if (���� != null && !����.is����())
					{
						if (������.����_����_�����Ƿ���(������))
						{
							if (�ڼ��� == 3)
							{
								����.������(���ɻغ���, ��������);
							}
							���˺� += ����.����������˺�(�ͷŴ˼��ܵ�Ӣ��, �����˺�, ��ֵ��͸, �ٷֱȴ�͸, ��������);
							is���� = true;
						}
					}
				}
				������װ����.ʵ��.�������(��������);
				if (is����)
				{
					�������д���++;
				}
			}
			if (�������д��� > 0)
			{
				����֮��״̬��.��֪ͨ�������д���(3, �ͷŴ˼��ܵ�Ӣ��);
				�ͷŴ˼��ܵ�Ӣ��.������Ѫ(���˺�, true);
			}
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
	public String get�����ļ���׺()
	{
		return "B";
	}
}
