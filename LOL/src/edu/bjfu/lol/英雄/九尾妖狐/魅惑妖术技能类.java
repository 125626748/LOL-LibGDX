package edu.bjfu.lol.Ӣ��.��β����;

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
import edu.bjfu.lol.scenes.scene2d.����.����������;
import edu.bjfu.lol.screen.��ս��Ļ��;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.Ӣ��.��β����.�����Ǽ�����.������״̬��;
import edu.bjfu.lol.�߼�.������;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class �Ȼ����������� extends ������ {

	private static final int ��һ���ͷŻغ��� = 1;
	private static final int �ͷż���غ��� = 4;
	private static final int �����˺� = 60;
	private static final float �����˺���ռ����ǿ�ȱ��� = 0.35f;
	private static final float ������ = 50f / 100;
	private static final int �Ȼ�����غ��� = 1;
	private static final String ������ = "�Ȼ�����";
	private static final String �������� = String.format("%s  �����׳��촽����,�����Ŀ�����%d(+%.2f����ǿ��)����\nĿ���Ȼ�,������%.0f%%,��Ŀ���������Ե�������,�Ȼ�Ч������%d�غ�.", 
			������
			,�����˺�, �����˺���ռ����ǿ�ȱ���, ������ * 100, �Ȼ�����غ���);
	public �Ȼ�����������() {
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class �Ȼ����������� extends ������
	{
		private float ������x;
		private float ������y;
		private float ������x;
		private float ������y;
		private String Ӣ��Ƥ���ļ���;
		public �Ȼ�����������(float ������x, float ������y, float ������x, float ������y, String Ӣ��Ƥ���ļ���)
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
			return new �Ȼ�����������(������x, ������y, ������x, ������y, Ӣ��Ƥ���ļ���);
		}
	}
	private class �Ȼ����������� extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(0.2f);
		private ������Ա�� ����;
		private Music ��Ч; 
		public �Ȼ�����������(float ������X, float ������Y, float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "AhriSkillE.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			�����ƶ�Action �ƶ�Action = new �����ƶ�Action(������X, ������Y, 0.6f);
			SequenceAction ����Action = Actions.sequence(�ƶ�Action, �ӳ�);
			����.addAction(����Action);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "AhriSkillE.mp3"));
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
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��) {
		��ս��Ӣ���� ���� = �з�����.get���������Ӣ��(true);
		if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
		{
			������װ����.ʵ��.�������(new �Ȼ�����������(
					��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
					��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
					��ս��Ļ��.�з�X��������[����.getӢ������λ��() - 1],
					��ս��Ļ��.�з�Y��������[����.getӢ������λ��() - 1], 
					�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		else
		{
			������װ����.ʵ��.�������(new �Ȼ�����������(
					��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
					��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
					��ս��Ļ��.�ҷ�X��������[����.getӢ������λ��() - 1],
					��ս��Ļ��.�ҷ�Y��������[����.getӢ������λ��() - 1],
					�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
		}
		if (������.����_����_�����Ƿ���(������))
		{
			���������� �������� = new ����������();
			����.������(�Ȼ�����غ���, ��������);
			int ����˺� = ����.�����ħ���˺�(�ͷŴ˼��ܵ�Ӣ��, (int) (�����˺�  + �����˺���ռ����ǿ�ȱ��� * �ͷŴ˼��ܵ�Ӣ��.get��ս�з���ǿ��()), �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ������͸(), �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȷ�����͸(), ��������);
			������װ����.ʵ��.�������(��������);
			������״̬��.������Ѫ(�ͷŴ˼��ܵ�Ӣ��.is�ҷ�(), �ͷŴ˼��ܵ�Ӣ��.getӢ������λ��(), �ͷŴ˼��ܵ�Ӣ��, 1, ����˺�, false);
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
		return "D";
	}
}
