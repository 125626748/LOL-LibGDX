package edu.bjfu.lol.Ӣ��.�޼���ʥ;

import java.util.Iterator;
import java.util.LinkedList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.audio.Music;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

import edu.bjfu.lol.scenes.scene2d.actions.�ӳ�Action;
import edu.bjfu.lol.scenes.scene2d.ui.������Ա��;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.����ǰҡ������;
import edu.bjfu.lol.scenes.scene2d.����.������;
import edu.bjfu.lol.scenes.scene2d.����.������װ����;
import edu.bjfu.lol.scenes.scene2d.����.����������;
import edu.bjfu.lol.scenes.scene2d.����.״̬�ı���ʾ������;
import edu.bjfu.lol.screen.��ս��Ļ��;
import edu.bjfu.lol.screen.��ս��Ļ��.Ӣ��������;
import edu.bjfu.lol.utils.������;
import edu.bjfu.lol.utils.���ֲ������Զ�������;
import edu.bjfu.lol.��̬.��ս��Ӣ����;
import edu.bjfu.lol.��̬.��ս��Ӣ����.��ͨ��������Ч��״̬��;
import edu.bjfu.lol.��̬.��ս��������;
import edu.bjfu.lol.�߼�.������;
import edu.bjfu.lol.��̬.������;
import edu.bjfu.lol.��̬.Ӣ����;

class ������ͻϮ������ extends ������
{
	private static final int ��һ���ͷŻغ��� = 1;
	private static final int �ͷż���غ��� = 6;
	private static final float ���������� = 0.5f;
	private static final int ���ܻ����˺� = 25;
	private static final float ���ܸ����˺���ռ���������� = 1.0f;
	private static final float ����ʱ�����˺�ռ���������� = 0.6f;
	private static final String ������ = "������ͻϮ";
	private static final String �������� = String.format("%s  �׷��ٴ�Խս��,�Եз�С��Χ���˸����%d(+%.1f������)\n�����˺�,������%.0f%%,������ͻϮ�ܹ�����,����ʱ��ɶ���%.1f��������\n���˺�,ÿ����ͨ�������ٸü���1�غ���ȴʱ��.",
			������
			,���ܻ����˺�, ���ܸ����˺���ռ����������, ���������� * 100, ����ʱ�����˺�ռ����������);
	private static class ��ͨ�������ٰ�����ͻϮ������ȴ״̬�� extends ��ͨ��������Ч��״̬��
	{
		public ��ͨ�������ٰ�����ͻϮ������ȴ״̬��()
		{
			super(Integer.MAX_VALUE);
		}
		@Override
		public void ��ͨ����(��ս��Ӣ���� ������, ��ս��Ӣ���� ��������, Iterator<��ͨ��������Ч��״̬��> ������)
		{
			������.get��ս�м�������()[0].���ټ�����ȴ�غ���(1);
			������װ����.ʵ��.�������(new ״̬�ı���ʾ������(������.is�ҷ�(), ������.getӢ������λ��(), "������ͻϮ��ȴ����", true));
			Gdx.app.debug("������ͻϮ������.��ͨ�������ٰ�����ͻϮ������ȴ״̬��.��ͨ����", String.format("%s������ͻϮ�����ٰ�����ͻϮ������ȴʱ��1�غ�\n", ������.get����������λ��Ӣ������()));
		}
		@Override
		public String get״̬����()
		{
			return "������ͻϮ��ÿ����ͨ�������ٸü���1�غ���ȴʱ��";
		}
	}
	public ������ͻϮ������() {
		super(��һ���ͷŻغ���, �ͷż���غ���);
	}
	private class �ͷ������� extends ������
	{
		private boolean is�ҷ�;
		private int Ӣ������λ��;
		private String Ӣ��Ƥ���ļ���;
		private LinkedList<Vector2> λ������ = new LinkedList<Vector2>();
		public �ͷ�������(boolean is�ҷ�, int Ӣ������λ��, String Ӣ��Ƥ���ļ���, LinkedList<��ս��Ӣ����> ������Ӣ������)
		{
			this.is�ҷ� = is�ҷ�;
			this.Ӣ������λ�� = Ӣ������λ��;
			this.Ӣ��Ƥ���ļ��� = Ӣ��Ƥ���ļ���;
			for (��ս��Ӣ���� Ӣ�� : ������Ӣ������)
			{
				if (!is�ҷ�)
				{
					λ������.add(new Vector2(��ս��Ļ��.�ҷ�X��������[Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�ҷ�Y��������[Ӣ��.getӢ������λ��()-1]));
				}
				else
				{
					λ������.add(new Vector2(��ս��Ļ��.�з�X��������[Ӣ��.getӢ������λ��()-1], ��ս��Ļ��.�з�Y��������[Ӣ��.getӢ������λ��()-1]));
				}
			}
		}
		@Override
		protected ������ ���ɶ���()
		{
			return new �ͷŶ�����(is�ҷ�, Ӣ������λ��, Ӣ��Ƥ���ļ���, λ������);
		}
		
	}
	private class �ͷŶ����� extends ������
	{
		private �ӳ�Action �ӳ� = new �ӳ�Action(����ǰҡ������.��ս����ڶ�ʱ��);
		private Music ��Ч;
		private Ӣ�������� �ͷż���Ӣ������;
		private ������Ա��[] ��������������;
		private �ͷŶ�����(boolean is�ҷ�, int Ӣ������λ��, String Ӣ��Ƥ���ļ���, LinkedList<Vector2> λ������)
		{
			�ͷż���Ӣ������ = ��ս��Ļ��.ʵ��.getӢ������(is�ҷ�, Ӣ������λ��);
			�������������� = new ������Ա��[λ������.size()];
			Skin Ƥ����Դ = Ӣ����.getƤ����Դ(Ӣ��Ƥ���ļ���);
			TextureRegion[] ֡���� = new TextureRegion[3];
			֡����[0] = Ƥ����Դ.getRegion("SkillQA");
			֡����[1] = Ƥ����Դ.getRegion("SkillQB");
			֡����[2] = Ƥ����Դ.getRegion("SkillQC");
			for (int i = 0; i < λ������.size(); i++)
			{
				��������������[i] = new ������Ա��(����ǰҡ������.��ս����ڶ�ʱ�� / 3, ֡����, Animation.NORMAL);
				��������������[i].setWidth(��ս��Ļ��.Ӣ��ͼƬ����� * 0.7f);
				��������������[i].setHeight(��ս��Ļ��.Ӣ��ͼƬ���߶� * 0.7f);
				Vector2 λ�� = λ������.get(i);
				��������������[i].setPosition(λ��.x - ��������������[i].getWidth() / 2, λ��.y - ��������������[i].getHeight() / 2);
			}
			��Ч = Gdx.audio.newMusic(Gdx.files.internal(������.����Ŀ¼ + "MasterYiSkillQ.mp3"));
			��Ч.setOnCompletionListener(new ���ֲ������Զ�������());
		}
		@Override
		public boolean is���()
		{
			if (�ӳ�.isAction�ѽ���())
			{
				for (������Ա�� ���� : ��������������)
				{
					����.remove();
				}
				�ͷż���Ӣ������.setColor(1,1,1,1);
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
			for (������Ա�� ���� : ��������������)
			{
				��ս��Ļ��.ʵ��.�����Ա(����);
			}
			�ͷż���Ӣ������.setColor(1,1,1,0);
			�ͷż���Ӣ������.addAction(�ӳ�);
			��Ч.play();
		}
	}
	@Override
	public boolean �ͷ�(��ս�������� �з�����, ��ս��Ӣ���� �ͷŴ˼��ܵ�Ӣ��) {
		int ������������˺� = 0;
		boolean is���� = false;
		boolean is�ͷ� = false;
		int ��ֵ��͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս����ֵ���״�͸();
		float �ٷֱȴ�͸ = �ͷŴ˼��ܵ�Ӣ��.get��ս�аٷֱȻ��״�͸();
		���������� �������� = new ����������();
		LinkedList<��ս��Ӣ����> ������Ӣ������ = new LinkedList<��ս��Ӣ����>();
		for (��ս��Ӣ���� �з�Ӣ�� : �з�����.getĬ�ϱ�����С��ΧӢ������(�ͷŴ˼��ܵ�Ӣ��))
		{
			if (�з�Ӣ�� != null && !�з�Ӣ��.is����() && !�з�Ӣ��.is��ս������())
			{
				is�ͷ� = true;
				// �Ƿ�����
				if (������.����_����_�����Ƿ���(����������))
				{
					������Ӣ������.add(�з�Ӣ��);
					int ������ = �ͷŴ˼��ܵ�Ӣ��.get��ս�й�����();
					int �����˺� = ���ܻ����˺� + (int)(������ * ���ܸ����˺���ռ����������);
					// �Ƿ񱩻�
					if (������.����_����_�����Ƿ���(�ͷŴ˼��ܵ�Ӣ��.get��ս�б�������()))
					{
						�����˺� += ����ʱ�����˺�ռ���������� * ������;
					}
					������������˺� += �з�Ӣ��.����������˺�(�ͷŴ˼��ܵ�Ӣ��, �����˺�, ��ֵ��͸, �ٷֱȴ�͸, ��������);
					is���� = true;
				}
			}
		}
		if (is����)
		{
			�ͷŴ˼��ܵ�Ӣ��.������Ѫ(������������˺�, true);
		}
		if (is�ͷ�)
		{
			������װ����.ʵ��.�������(new �ͷ�������(�ͷŴ˼��ܵ�Ӣ��.is�ҷ�(), �ͷŴ˼��ܵ�Ӣ��.getӢ������λ��(), �ͷŴ˼��ܵ�Ӣ��.getӢ��().getӢ��Ƥ���ļ���(), ������Ӣ������));
			������װ����.ʵ��.�ӳ��������(��������);
		}
		return is�ͷ�;
	}
	@Override
	public String get��������() {
		return ��������;
	}
	@Override
	public void ��ӱ���״̬(��ս��Ӣ���� ��ս��Ӣ��)
	{
		��ս��Ӣ��.�����ͨ��������Ч��״̬(new ��ͨ�������ٰ�����ͻϮ������ȴ״̬��());
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
