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
import edu.bjfu.lol.screen.��ս��Ļ��;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.Ӣ��.��β����.�����Ǽ�����.������״̬��;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ���ͻϮ������ extends ������ {

	private static final int ��һ���ͷŻغ��� = 2;
	private static final int �ͷż���غ��� = 15;
	private static final int �����˺� = 85;
	private static final float �����˺���ռ����ǿ�ȱ��� = 0.35f;
	private static final int ������غ��� = 1;
	private static final String ������ = "���ͻϮ";
	private static final String �������� = String.format("%s  ����������һ����ǰ���,�������3�����˷���Ԫ����,���\n%d(+%.2f����ǿ��)ħ���˺�,��������,����������%d�غ�.", 
			������
			,�����˺�, �����˺���ռ����ǿ�ȱ���, ������غ���);
	public ���ͻϮ������() {
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class ���ͻϮ������ extends ������
	{
		private float ������x;
		private float ������y;
		private float ������x;
		private float ������y;
		private String Ӣ��Ƥ���ļ���;
		public ���ͻϮ������(float ������x, float ������y, float ������x, float ������y, String Ӣ��Ƥ���ļ���)
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
			return new ���ͻϮ������(������x, ������y, ������x, ������y, Ӣ��Ƥ���ļ���);
		}
	}
	private class ���ͻϮ������ extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(0.25f);
		private ������Ա�� ����;
		private Music ��Ч; 
		public ���ͻϮ������(float ������X, float ������Y, float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
		{
			ParticleEffect ����Ч�� = new ParticleEffect();
			����Ч��.load(Gdx.files.internal(������.����Ŀ¼ + "AhriSkillW.p"), Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���).getAtlas());
			���� = new ������Ա��(����Ч��);
			����.setPosition(������X, ������Y);
			�����ƶ�Action �ƶ�Action = new �����ƶ�Action(������X, ������Y, 0.55f);
			SequenceAction ����Action = Actions.sequence(�ƶ�Action, �ӳ�);
			����.addAction(����Action);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "AhriSkillR.mp3"));
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
		int �����˺� = (int) (�����˺� + �����˺���ռ����ǿ�ȱ��� * �ͷŴ˼��ܵ�Ӣ��.get��ս�з���ǿ��());
		int ����˺� = 0;
		int ���и��� = 0;
		int ��ֵ��͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ������͸();
		float �ٷֱȴ�͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȷ�����͸();
		boolean is�ҷ� = �ͷŴ˼��ܵ�Ӣ��.is�ҷ�();
		for (int i = 0; i < 3; i++)
		{
			��ս��Ӣ���� ���� = �з�����.get���������Ӣ��(false);
			if (���� != null)
			{
				if (is�ҷ�)
				{
					������װ����.ʵ��.�������(new ���ͻϮ������(
							��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
							��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
							��ս��Ļ��.�з�X��������[����.getӢ������λ��() - 1],
							��ս��Ļ��.�з�Y��������[����.getӢ������λ��() - 1], 
							�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
				}
				else
				{
					������װ����.ʵ��.�������(new ���ͻϮ������(
							��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
							��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��() - 1],
							��ս��Ļ��.�ҷ�X��������[����.getӢ������λ��() - 1],
							��ս��Ļ��.�ҷ�Y��������[����.getӢ������λ��() - 1], 
							�ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
				}
				����˺� += ����.�����ħ���˺�(�ͷŴ˼��ܵ�Ӣ��, �����˺�, ��ֵ��͸, �ٷֱȴ�͸, null);
				���и���++;
			}
		}
		if (���и��� > 0)
		{
			������״̬��.������Ѫ(�ͷŴ˼��ܵ�Ӣ��.is�ҷ�(), �ͷŴ˼��ܵ�Ӣ��.getӢ������λ��(), �ͷŴ˼��ܵ�Ӣ��, ���и���, ����˺�, true);
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
