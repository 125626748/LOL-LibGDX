package edu.bjfu.lol.Ӣ��.��β����;

import java.util.HashSet;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.SequenceAction;

import edu.bjfu.lol.scenes.scene2d.actions.�ӳ�Action;
import edu.bjfu.lol.scenes.scene2d.actions.�����ƶ�Action;
import edu.bjfu.lol.scenes.scene2d.ui.������Ա��;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.screen.��ս��Ļ��;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.Ӣ��.��β����.�����Ǽ�����.������״̬��;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ����������� extends ������
{
	private static final int ��һ���ͷŻغ��� = 2;
	private static final int �ͷż���غ��� = 5;
	private static final int �����˺� = 40;
	private static final float �����˺���ռ����ǿ�ȱ��� = 0.4f;
	private static final float �����������˺��ٷֱ� = 50f / 100;
	private static final String ������ = "�������";
	private static final String �������� = String.format("%s  ����ų����ź���,���ǻ������з�С��Χ�������˽��й���,\n���%d(+%.1f����ǿ��)ħ���˺�,������ͬһĿ��ʱ,����ĺ�������\n%.0f%%�˺�.",
			������
			,�����˺�, �����˺���ռ����ǿ�ȱ���, �����������˺��ٷֱ� * 100);
	public �����������()
	{
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class ���������� extends ������
	{
		private float ������x;
		private float ������y;
		private float ������x;
		private float ������y;
		private String Ӣ��Ƥ���ļ���;
		public ����������(float ������x, float ������y, float ������x, float ������y, String Ӣ��Ƥ���ļ���)
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
			return new ������������(������x, ������y, ������x, ������y, Ӣ��Ƥ���ļ���);
		}
	}
	private class ������������ extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(0.25f);
		private ������Ա�� ����;
		private Music ��Ч; 
		public ������������(float ������X, float ������Y, float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "AhriSkillW.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			�����ƶ�Action �ƶ�Action = new �����ƶ�Action(������X, ������Y, 0.55f);
			SequenceAction ����Action = Actions.sequence(�ƶ�Action, �ӳ�);
			����.addAction(����Action);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "AhriSkillW.mp3"));
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		}
		@Override
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
	// �����ͷż��ܵļ���
	private HashSet<��ս��Ӣ����> �������������Ӣ�ۼ��� = new HashSet<��ս��Ӣ����>();
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��) {
		�������������Ӣ�ۼ���.clear();
		int �����˺� = (int) (�����˺� + �����˺���ռ����ǿ�ȱ��� * �ͷŴ˼��ܵ�Ӣ��.get��ս�з���ǿ��());
		int ��������˺� = (int) (�����˺� * �����������˺��ٷֱ�);
		int ����˺� = 0;
		int ���и��� = 0;
		int ��ֵ��͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ������͸();
		float �ٷֱȴ�͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȷ�����͸();
		for (��ս��Ӣ���� ���� : �з�����.getĬ�ϱ�����С��ΧӢ������(�ͷŴ˼��ܵ�Ӣ��))
		{
			if (���� != null && !����.is����() && !����.is��ս������())
			{
				if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
				{
					������װ����.ʵ��.�������(new ����������(
							��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
							��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
							��ս��Ļ��.�з�X��������[����.getӢ������λ��() - 1],
							��ս��Ļ��.�з�Y��������[����.getӢ������λ��() - 1], 
							�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
				}
				else
				{
					������װ����.ʵ��.�������(new ����������(
							��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
							��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
							��ս��Ļ��.�ҷ�X��������[����.getӢ������λ��() - 1],
							��ս��Ļ��.�ҷ�Y��������[����.getӢ������λ��() - 1],
							�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
				}
				if (�������������Ӣ�ۼ���.contains(����))
				{
					����˺� += ����.�����ħ���˺�(�ͷŴ˼��ܵ�Ӣ��, ��������˺�, ��ֵ��͸, �ٷֱȴ�͸, null);
				}
				else
				{
					���и���++;
					����˺� += ����.�����ħ���˺�(�ͷŴ˼��ܵ�Ӣ��, �����˺�, ��ֵ��͸, �ٷֱȴ�͸, null);
					�������������Ӣ�ۼ���.add(����);
				}
			}
		}
		if (���и��� > 0)
		{
			������״̬��.������Ѫ(�ͷŴ˼��ܵ�Ӣ��.is�ҷ�(), �ͷŴ˼��ܵ�Ӣ��.getӢ������λ��(), �ͷŴ˼��ܵ�Ӣ��, ���и���, ����˺�, true);
		}
		return true;
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
		return "C";
	}
}
