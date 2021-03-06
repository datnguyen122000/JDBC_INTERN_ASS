USE [DatNQ30_JSP_003]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 10/25/2021 4:26:30 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[id] [int] IDENTITY(1,1) NOT NULL,
	[userName] [varchar](50) NOT NULL,
	[email] [varchar](50) NOT NULL,
	[password] [varchar](50) NOT NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Content]    Script Date: 10/25/2021 4:26:30 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Content](
	[Id] [int] IDENTITY(1,1) NOT NULL,
	[Title] [varchar](max) NOT NULL,
	[Brief] [varchar](max) NOT NULL,
	[Content] [varchar](max) NOT NULL,
	[CreateDate] [datetime] NULL,
	[AccountId] [int] NOT NULL,
 CONSTRAINT [PK_Content] PRIMARY KEY CLUSTERED 
(
	[Id] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Profile]    Script Date: 10/25/2021 4:26:30 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Profile](
	[AccountID] [int] NOT NULL,
	[FirstName] [varchar](50) NOT NULL,
	[LastName] [varchar](50) NOT NULL,
	[Phone] [varchar](50) NOT NULL,
	[Description] [varchar](max) NOT NULL,
 CONSTRAINT [PK_Profile] PRIMARY KEY CLUSTERED 
(
	[AccountID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Account] ON 

INSERT [dbo].[Account] ([id], [userName], [email], [password]) VALUES (2, N'DatNQ30', N'DatNQ30@fsoft.com', N'Datpass899168$')
INSERT [dbo].[Account] ([id], [userName], [email], [password]) VALUES (3, N'Truongvv8', N'Truongvv8@fsoft.com', N'Truongpass899168$')
INSERT [dbo].[Account] ([id], [userName], [email], [password]) VALUES (4, N'Truongvv9', N'Truongvv9@fsoft.com', N'Truongpass888999$')
INSERT [dbo].[Account] ([id], [userName], [email], [password]) VALUES (5, N'hoangnq2', N'sdfd$@gmail.com', N'1234qwe!')
INSERT [dbo].[Account] ([id], [userName], [email], [password]) VALUES (6, N'datnqhe141546', N'datnguyen122000@gmail.com', N'123qwe!')
INSERT [dbo].[Account] ([id], [userName], [email], [password]) VALUES (7, N'datnqhe141546', N'datnguyen122000@gmail.com', N'sdf123!')
INSERT [dbo].[Account] ([id], [userName], [email], [password]) VALUES (19, N'sdf', N'oqwer@gmail.com', N'123qwe!')
SET IDENTITY_INSERT [dbo].[Account] OFF
GO
SET IDENTITY_INSERT [dbo].[Content] ON 

INSERT [dbo].[Content] ([Id], [Title], [Brief], [Content], [CreateDate], [AccountId]) VALUES (12, N'xcv', N'sdf', N'sdf', CAST(N'2016-08-31T00:00:00.000' AS DateTime), 2)
INSERT [dbo].[Content] ([Id], [Title], [Brief], [Content], [CreateDate], [AccountId]) VALUES (13, N'sdfs', N'sdf', N'xcv', CAST(N'2021-10-21T00:00:00.000' AS DateTime), 2)
INSERT [dbo].[Content] ([Id], [Title], [Brief], [Content], [CreateDate], [AccountId]) VALUES (15, N'xcv', N'sdf', N'sdf', CAST(N'2016-08-31T00:00:00.000' AS DateTime), 2)
INSERT [dbo].[Content] ([Id], [Title], [Brief], [Content], [CreateDate], [AccountId]) VALUES (16, N'xcv', N'sdf', N'sdf', CAST(N'2021-10-21T00:00:00.000' AS DateTime), 2)
INSERT [dbo].[Content] ([Id], [Title], [Brief], [Content], [CreateDate], [AccountId]) VALUES (17, N'xcv', N'sdf', N'sdf', CAST(N'2021-10-21T00:00:00.000' AS DateTime), 2)
INSERT [dbo].[Content] ([Id], [Title], [Brief], [Content], [CreateDate], [AccountId]) VALUES (18, N'xcv', N'sdf', N'sdf', CAST(N'2012-06-18T00:00:00.000' AS DateTime), 2)
INSERT [dbo].[Content] ([Id], [Title], [Brief], [Content], [CreateDate], [AccountId]) VALUES (19, N'dsf', N'df', N'sdf', CAST(N'2021-10-21T00:00:00.000' AS DateTime), 2)
INSERT [dbo].[Content] ([Id], [Title], [Brief], [Content], [CreateDate], [AccountId]) VALUES (20, N'dsf', N'df', N'sdf', CAST(N'2021-10-21T11:21:33.857' AS DateTime), 2)
INSERT [dbo].[Content] ([Id], [Title], [Brief], [Content], [CreateDate], [AccountId]) VALUES (21, N'dsf', N'df', N'sdf', CAST(N'2000-01-02T12:04:00.000' AS DateTime), 2)
INSERT [dbo].[Content] ([Id], [Title], [Brief], [Content], [CreateDate], [AccountId]) VALUES (22, N'df', N'df', N'df', CAST(N'2021-10-21T11:10:00.000' AS DateTime), 2)
INSERT [dbo].[Content] ([Id], [Title], [Brief], [Content], [CreateDate], [AccountId]) VALUES (23, N'sdf', N'sdf', N'sdf', CAST(N'2021-10-21T11:30:00.000' AS DateTime), 2)
INSERT [dbo].[Content] ([Id], [Title], [Brief], [Content], [CreateDate], [AccountId]) VALUES (24, N'1234 nay', N'abdc 234', N's342dvm', CAST(N'2021-10-21T14:51:00.000' AS DateTime), 2)
INSERT [dbo].[Content] ([Id], [Title], [Brief], [Content], [CreateDate], [AccountId]) VALUES (25, N'sdfdf234', N'34234 90', N'sdf9 -9', CAST(N'2021-10-21T14:52:00.000' AS DateTime), 2)
INSERT [dbo].[Content] ([Id], [Title], [Brief], [Content], [CreateDate], [AccountId]) VALUES (26, N'sdf', N'sdf', N'xcv', CAST(N'2021-10-21T15:10:00.000' AS DateTime), 2)
INSERT [dbo].[Content] ([Id], [Title], [Brief], [Content], [CreateDate], [AccountId]) VALUES (27, N'title final', N'brief final', N'description final', CAST(N'2021-10-21T20:16:00.000' AS DateTime), 2)
INSERT [dbo].[Content] ([Id], [Title], [Brief], [Content], [CreateDate], [AccountId]) VALUES (28, N'Tittle 1', N'Brief 1', N'Des1', CAST(N'2021-10-25T15:13:00.000' AS DateTime), 4)
INSERT [dbo].[Content] ([Id], [Title], [Brief], [Content], [CreateDate], [AccountId]) VALUES (29, N'Title 1', N'Brief 1', N'Des 1', CAST(N'2021-10-25T15:40:00.000' AS DateTime), 6)
INSERT [dbo].[Content] ([Id], [Title], [Brief], [Content], [CreateDate], [AccountId]) VALUES (30, N'Tittle 2', N'Brief 2', N'Des 2', CAST(N'2021-10-25T15:41:00.000' AS DateTime), 6)
INSERT [dbo].[Content] ([Id], [Title], [Brief], [Content], [CreateDate], [AccountId]) VALUES (31, N'Title 3', N'Brief 3', N'Des 3', CAST(N'2021-10-25T15:41:00.000' AS DateTime), 6)
INSERT [dbo].[Content] ([Id], [Title], [Brief], [Content], [CreateDate], [AccountId]) VALUES (32, N'Title x', N'Brief x', N'Des x', CAST(N'2021-10-25T16:19:00.000' AS DateTime), 2)
SET IDENTITY_INSERT [dbo].[Content] OFF
GO
INSERT [dbo].[Profile] ([AccountID], [FirstName], [LastName], [Phone], [Description]) VALUES (2, N'Dat', N'Vuong', N'0948854268', N'Fpt University')
INSERT [dbo].[Profile] ([AccountID], [FirstName], [LastName], [Phone], [Description]) VALUES (3, N'Truong', N'Vuong', N'01234566', N'No Description')
INSERT [dbo].[Profile] ([AccountID], [FirstName], [LastName], [Phone], [Description]) VALUES (4, N'Truong', N'Nguyen', N'0920349234999', N'No Description')
INSERT [dbo].[Profile] ([AccountID], [FirstName], [LastName], [Phone], [Description]) VALUES (6, N'Dat', N'Tran', N'0915361593', N'No Des')
GO
ALTER TABLE [dbo].[Content]  WITH CHECK ADD  CONSTRAINT [FK_Content_Account] FOREIGN KEY([AccountId])
REFERENCES [dbo].[Account] ([id])
GO
ALTER TABLE [dbo].[Content] CHECK CONSTRAINT [FK_Content_Account]
GO
ALTER TABLE [dbo].[Profile]  WITH CHECK ADD  CONSTRAINT [FK_Profile_Account] FOREIGN KEY([AccountID])
REFERENCES [dbo].[Account] ([id])
GO
ALTER TABLE [dbo].[Profile] CHECK CONSTRAINT [FK_Profile_Account]
GO
