package edu.bjfu.lol.Ӣ��.��������;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.ParticleEffect;
import com.badlogic.gdx.graphics.g2d.ParticleEmitter;
import com.badlogic.gdx.graphics.g2d.ParticleEmitter.ScaledNumericValue;

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
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ӥ�����ռ����� extends ������
{
	private static final int ��һ���ͷŻغ��� = 2;
	private static final int �ͷż���غ��� = 10;
	private static final int ��Ұ�����غ��� = 2;
	private static final String ������ = "ӥ������";
	private static final String �������� = String.format("%s  ��ϣ��һ��ӥ�����ʵ�廯,�������������,������ʾ�з�\n����λ,��Ұ����%d�غ�.",
			������
			,��Ұ�����غ���);
	private static class ����״̬�� extends ��ս��Ӣ����.����״̬��
	{
		public ����״̬��()
		{
			super(��Ұ�����غ���);
		}
		@Override
		public String get״̬����()
		{
			return "ӥ�����գ��õ�λ����ϣ��ӥ����鵽";
		}
	}
	public ӥ�����ռ�����()
	{
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class �ͷ������� extends ������
	{
		private boolean is�ҷ��ͷ�;
		private String Ӣ��Ƥ���ļ���;
		public �ͷ�������(boolean is�ҷ��ͷ�, String Ӣ��Ƥ���ļ���)
		{
			this.is�ҷ��ͷ� = is�ҷ��ͷ�;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �ͷŶ�����(is�ҷ��ͷ�, Ӣ��Ƥ���ļ���);
		}
	}
	private class �ͷŶ����� extends ������
	{
		private ����ƶ�Action �ƶ�Action;
		private ������Ա�� ����;
		private Music ��Ч;
		public �ͷŶ�����(boolean is�ҷ��ͷ�, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "AsheSkillE.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			if (is�ҷ��ͷ�)
			{
				����.setPosition(������.��Ļ�� / 2, 0);
				�ƶ�Action = new ����ƶ�Action(0, ������.��Ļ��, 1f);
			}
			else
			{
				ParticleEmitter �� = ����Ч��.findEmitter("bird");
				ScaledNumericValue ��תֵ = ��.getRotation();
				��תֵ.setHigh(180);
				����.setPosition(������.��Ļ�� / 2, ������.��Ļ��);
				�ƶ�Action = new ����ƶ�Action(0, -������.��Ļ��, 1f);
			}
			����.addAction(�ƶ�Action);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "AsheSkillE.mp3"));
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
		������װ����.ʵ��.�������(new �ͷ�������(�ͷŴ˼��ܵ�Ӣ��.is�ҷ�(), �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		���������� �������� = new ����������();
		for (��ս��Ӣ���� �з�Ӣ�� : �з�����.get��ս��Ӣ������())
		{
			if (�з�Ӣ�� != null && !�з�Ӣ��.is����())
			{
				��������.�������(new ״̬�ı���ʾ������(�з�Ӣ��.is�ҷ�(), �з�Ӣ��.getӢ������λ��(), "����", false));
				�з�Ӣ��.�������״̬(new ����״̬��(), ��������);
			}
		}
		������װ����.ʵ��.�������(��������);
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
		return "D";
	}
}
