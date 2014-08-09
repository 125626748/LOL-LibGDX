package edu.bjfu.lol.Ӣ��.��Ѫ����;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

import edu.bjfu.lol.scenes.scene2d.actions.�ӳ�Action;
import edu.bjfu.lol.scenes.scene2d.ui.������Ա��;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.����ǰҡ������;
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

class ��Ѫ���������� extends ������ {

	private static final int ��һ���ͷŻغ��� = 2;
	private static final int �ͷż���غ��� = 5;
	private static final int ���ܻ����˺� = 75;
	private static final float ���ܸ����˺���ռ����ǿ�ȱ��� = 1;
	private static final float Ŀ������ֵ�ٷֱ� = 8f / 100;
	private static final float ����Ч���ٷֱ� = 80f / 100;
	private static final String ������ = "��Ѫ����";
	private static final String �������� = String.format("%s  �ͻ�����,���%d(+%.0f����ǿ��)��Ŀ��%.0f%%�������ֵ(+%.0f����\nǿ��)֮������ħ���˺�,�������Լ�,����Ч��Ϊ����ɵ��˺���%.0f%%.",
			������
			,���ܻ����˺�, ���ܸ����˺���ռ����ǿ�ȱ���, Ŀ������ֵ�ٷֱ� * 100, ���ܸ����˺���ռ����ǿ�ȱ���, ����Ч���ٷֱ� * 100);
	public ��Ѫ����������() {
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class �ͷ������� extends ������
	{
		private float ������X;
		private float ������Y;
		private String Ӣ��Ƥ���ļ���;
		public �ͷ�������(float ������x, float ������y, String Ӣ��Ƥ���ļ���)
		{
			������X = ������x;
			������Y = ������y;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �ͷŶ�����(������X, ������Y, Ӣ��Ƥ���ļ���);
		}
	}
	private class �ͷŶ����� extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(����ǰҡ������.��ս����ڶ�ʱ��);
		private Music ��Ч;
		private ������Ա�� ����������;
		private �ͷŶ�����(float ������X, float ������Y, String Ӣ��Ƥ���ļ���)
		{
			Skin Ƥ����Դ = Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���);
			TextureRegion[] ����֡���� = new TextureRegion[4];
			����֡����[0] = Ƥ����Դ.getRegion("SkillQA");
			����֡����[1] = Ƥ����Դ.getRegion("SkillQB");
			����֡����[2] = Ƥ����Դ.getRegion("SkillQC");
			����֡����[3] = Ƥ����Դ.getRegion("SkillQD");
			float ��ͨ������������ = 0.7f;
			���������� = new ������Ա��(�ӳ�.getDuration() / ����֡����.length, ����֡����, Animation.NORMAL);
			����������.setWidth(��ս��Ļ��.Ӣ��ͼƬ����� * ��ͨ������������);
			����������.setHeight(��ս��Ļ��.Ӣ��ͼƬ���߶� * ��ͨ������������);
			����������.setPosition(������X - ����������.getWidth() / 2, ������Y - ����������.getHeight() / 2);
			����������.addAction(�ӳ�);
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "WarwickSkillQ.mp3"));
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		}
		@Override
		public boolean is���()
		{
			if (�ӳ�.isAction�ѽ���())
			{
				����������.remove();
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
			��ս��Ļ��.ʵ��.�����Ա(����������);
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
			int �������ֵ�ٷֱ�����ֵ = (int) (������Ӣ��.get��ս���������ֵ() * Ŀ������ֵ�ٷֱ�);
			if (�ͷŴ˼��ܵ�Ӣ��.is�ҷ�())
			{
				��������.�������(new �ͷ�������(��ս��Ļ��.�ҷ�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�ҷ�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
			}
			else
			{
				��������.�������(new �ͷ�������(��ս��Ļ��.�з�X��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�з�Y��������[�ͷŴ˼��ܵ�Ӣ��.getӢ������λ��()-1], �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���()));
			}
			int ����˺� = ������Ӣ��.�����ħ���˺�(�ͷŴ˼��ܵ�Ӣ��, (int) (�ͷŴ˼��ܵ�Ӣ��.get��ս�з���ǿ��() * ���ܸ����˺���ռ����ǿ�ȱ��� + (���ܻ����˺� > �������ֵ�ٷֱ�����ֵ ? ���ܻ����˺� : �������ֵ�ٷֱ�����ֵ)), �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ������͸(), �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȷ�����͸(), ��������);
			�ͷŴ˼��ܵ�Ӣ��.��������ֵ((int) (����Ч���ٷֱ� * ����˺�), ��������);
			������װ����.ʵ��.�������(��������);
			�ͷŴ˼��ܵ�Ӣ��.������Ѫ(����˺�, false);
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
