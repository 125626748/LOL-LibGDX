package edu.bjfu.lol.Ӣ��.ĺ��֮��;

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
import edu.bjfu.lol.��̬.��ս��Ӣ����.����ͨ��������Ч��״̬��;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ����ȴа������ extends ������
{
	private static final int ��һ���ͷŻغ��� = 1;
	private static final int �ͷż���غ��� = 9;
	private static final int ���ܻ����˺� = 60;
	private static final float ���ܸ����˺���ռ����ǿ�ȱ��� = 0.6f;
	private static final int ȴаӡ�����غ��� = 2;
	private static final int ��ͨ���������ظ�����ֵ = 25;
	private static final float ��ͨ�������ӻظ�����ֵ��ռ�������ֵ�ٷֱ� = 1.5f / 100;
	private static final int ���������ظ�����ֵ = 6;
	private static final String ������ = "����ȴа";
	private static final String �������� = String.format("%s  ��Ŀ�굥λ���%d(+%.1f����ǿ��)ħ���˺�,����Ŀ��ʩ��һ\n������%d�غϵ�ȴаӡ,�Ѿ���ͨ������Ŀ���ʹ�Ѿ��ظ�%d(+%.1f%%���\n����ֵ)����ֵ,����������ڸü���,��ʹ��ֱ�ӻظ�%d����ֵ.", 
			������
			,���ܻ����˺�, ���ܸ����˺���ռ����ǿ�ȱ���, ȴаӡ�����غ���, ��ͨ���������ظ�����ֵ, ��ͨ�������ӻظ�����ֵ��ռ�������ֵ�ٷֱ�, ���������ظ�����ֵ);
	private static class ����ͨ�����ظ�����������ֵ״̬�� extends ����ͨ��������Ч��״̬��
	{
		private int ��������ֵ;
		public ����ͨ�����ظ�����������ֵ״̬��(int ��������ֵ)
		{
			super(ȴаӡ�����غ���);
			this.��������ֵ = ��������ֵ;
		}
		@Override
		public void ����ͨ����(��ս��Ӣ���� ������, ��ս��Ӣ���� ��������)
		{
			���������� �������� = new ����������();
			��������.�������(new ״̬�ı���ʾ������(������.is�ҷ�(), ������.getӢ������λ��(), "����ȴа�ظ�", true));
			������.��������ֵ(��������ֵ, ��������);
			������װ����.ʵ��.�������(��������);
		}
		@Override
		public String get״̬����()
		{
			return "����ȴа������ͨ������ظ�����������ֵ";
		}
	}
	public ����ȴа������()
	{
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
		public �ͷŶ�����(float ������X, float ������Y, float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "ShenSkillQ.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			�ƶ�Action = new �����ƶ�Action(������X, ������Y, 0.5f);
			����.addAction(�ƶ�Action);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "ShenSkillQ.mp3"));
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
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��)
	{
		��ս��Ӣ���� ������Ӣ�� = �з�����.getĬ�ϱ�����Ӣ��(�ͷŴ˼��ܵ�Ӣ��);
		if (������Ӣ�� != null)
		{
			���������� �������� = new ����������();
			if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
			{
				��������.�������(new �ͷ�������(��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�з�X��������[������Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�з�Y��������[������Ӣ��.getӢ������λ��()-1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
			}
			else
			{
				��������.�������(new �ͷ�������(��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�ҷ�X��������[������Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�ҷ�Y��������[������Ӣ��.getӢ������λ��()-1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
			}
			������Ӣ��.��ӱ���ͨ��������Ч��״̬(new ����ͨ�����ظ�����������ֵ״̬��(��ͨ���������ظ�����ֵ + (int) (��ͨ�������ӻظ�����ֵ��ռ�������ֵ�ٷֱ� * �ͷŴ˼��ܵ�Ӣ��.get��ս���������ֵ())));
			int ����˺� = ������Ӣ��.�����ħ���˺�(�ͷŴ˼��ܵ�Ӣ��, (int) (���ܻ����˺� + ���ܸ����˺���ռ����ǿ�ȱ��� * �ͷŴ˼��ܵ�Ӣ��.get��ս�з���ǿ��()), �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ������͸(), �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȷ�����͸(), ��������);
			�ͷŴ˼��ܵ�Ӣ��.������Ѫ(����˺�, false);
			if (������Ӣ��.is����())
			{
				Gdx.app.debug("����ȴа������.�ͷ�", "�������ڰ���ȴа���ظ�������ֵ");
				�ͷŴ˼��ܵ�Ӣ��.��������ֵ(���������ظ�����ֵ, ��������);
			}
			������װ����.ʵ��.�������(��������);
			return true;
		}
		else
		{
			return false;
		}
	}
	@Override
	public String get��������()
	{
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
