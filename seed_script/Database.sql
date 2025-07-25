﻿use [E2ETestElectricPowerSupply]

--izbrisi sve podatke



EXEC sp_MSForEachTable 'ALTER TABLE ? NOCHECK CONSTRAINT ALL' 
GO 

EXEC sp_MSForEachTable 'SET QUOTED_IDENTIFIER ON; DELETE FROM ?' 
GO 

-- Check if the index exists before attempting to drop it
IF EXISTS (
    SELECT 1 
    FROM sys.indexes 
    WHERE object_id = OBJECT_ID('Generate.ActiveBillGeneratorSummary')
    AND name = 'CAK_ActiveBillGeneratorSummary'
)
BEGIN
    DROP INDEX [CAK_ActiveBillGeneratorSummary] ON [Generate].[ActiveBillGeneratorSummary]
END
GO

CREATE UNIQUE CLUSTERED INDEX [CAK_ActiveBillGeneratorSummary] 
ON [Generate].[ActiveBillGeneratorSummary] ([Id] ASC)
GO

--insesrtuj podatke

SET IDENTITY_INSERT BasicCatalog.Entity ON

INSERT BasicCatalog.Entity 
    ([Id],[Name])
VALUES 
    (1, N'Republika Srpska'),
    (2, N'Federacija BiH'),
    (3, N'Brcko Distrik'),
    (4, N'Mjesto van BiH')

SET IDENTITY_INSERT BasicCatalog.Entity OFF


INSERT [Administration].[Configuration] ([Key], [Value]) VALUES (N'UnknownStreetNumber', N'BB')
GO
INSERT [Administration].[Configuration] ([Key], [Value]) VALUES (N'Currency', N'KM')
GO
INSERT [Administration].[Configuration] ([Key], [Value]) VALUES (N'VatRate', N'0.17')
GO
INSERT [Administration].[Configuration] ([Key], [Value]) VALUES (N'MaxAmountForInterestCorrectionClosure', N'5')
GO
INSERT [Administration].[Configuration] ([Key], [Value]) VALUES (N'MaxValidtyDateForContractTypeChangeAllowed', N'2021-04-01')
GO


SET IDENTITY_INSERT BasicCatalog.MeterType ON

INSERT BasicCatalog.MeterType 
    ([Id], [Name])
VALUES 
    (4, N'T1')

SET IDENTITY_INSERT BasicCatalog.MeterType OFF


SET IDENTITY_INSERT BasicCatalog.OperationalArea ON

INSERT BasicCatalog.OperationalArea 
    ([Id], [Name], [PhoneNumberForFaultApplication], [PhoneNumberForServiceInformation], [PhoneNumberForBillComplaint])
VALUES 
    (1, N'Operativno podrucje 1', N'057 111 222', N'057 111 222', N'057 111 222'),
    (2, N'Operativno podrucje 2', N'051 111 222', N'051 111 222', N'051 111 222'),
    (3, N'Operativno podrucje 3', N'058 111 222', N'058 111 222', N'058 111 222'),
    (4, N'Operativno podrucje 4', N'056 111 222', N'056 111 222', N'056 111 222')

SET IDENTITY_INSERT BasicCatalog.OperationalArea OFF


INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (1801, N'јануар 2018.', 2018, 1, CAST(N'2018-01-01' AS Date), CAST(N'2018-01-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (1802, N'фебруар 2018.', 2018, 2, CAST(N'2018-02-01' AS Date), CAST(N'2018-02-28' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (1803, N'март 2018.', 2018, 3, CAST(N'2018-03-01' AS Date), CAST(N'2018-03-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (1804, N'април 2018.', 2018, 4, CAST(N'2018-04-01' AS Date), CAST(N'2018-04-30' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (1805, N'мај 2018.', 2018, 5, CAST(N'2018-05-01' AS Date), CAST(N'2018-05-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (1806, N'јун 2018.', 2018, 6, CAST(N'2018-06-01' AS Date), CAST(N'2018-06-30' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (1807, N'јул 2018.', 2018, 7, CAST(N'2018-07-01' AS Date), CAST(N'2018-07-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (1808, N'август 2018.', 2018, 8, CAST(N'2018-08-01' AS Date), CAST(N'2018-08-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (1809, N'септембар 2018.', 2018, 9, CAST(N'2018-09-01' AS Date), CAST(N'2018-09-30' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (1810, N'октобар 2018.', 2018, 10, CAST(N'2018-10-01' AS Date), CAST(N'2018-10-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (1811, N'новембар 2018.', 2018, 11, CAST(N'2018-11-01' AS Date), CAST(N'2018-11-30' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (1812, N'децембар 2018.', 2018, 12, CAST(N'2018-12-01' AS Date), CAST(N'2018-12-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (1901, N'јануар 2019.', 2019, 1, CAST(N'2019-01-01' AS Date), CAST(N'2019-01-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (1902, N'фебруар 2019.', 2019, 2, CAST(N'2019-02-01' AS Date), CAST(N'2019-02-28' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (1903, N'март 2019.', 2019, 3, CAST(N'2019-03-01' AS Date), CAST(N'2019-03-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (1904, N'април 2019.', 2019, 4, CAST(N'2019-04-01' AS Date), CAST(N'2019-04-30' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (1905, N'мај 2019.', 2019, 5, CAST(N'2019-05-01' AS Date), CAST(N'2019-05-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (1906, N'јун 2019.', 2019, 6, CAST(N'2019-06-01' AS Date), CAST(N'2019-06-30' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (1907, N'јул 2019.', 2019, 7, CAST(N'2019-07-01' AS Date), CAST(N'2019-07-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (1908, N'август 2019.', 2019, 8, CAST(N'2019-08-01' AS Date), CAST(N'2019-08-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (1909, N'септембар 2019.', 2019, 9, CAST(N'2019-09-01' AS Date), CAST(N'2019-09-30' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (1910, N'октобар 2019.', 2019, 10, CAST(N'2019-10-01' AS Date), CAST(N'2019-10-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (1911, N'новембар 2019.', 2019, 11, CAST(N'2019-11-01' AS Date), CAST(N'2019-11-30' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (1912, N'децембар 2019.', 2019, 12, CAST(N'2019-12-01' AS Date), CAST(N'2019-12-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (2001, N'јануар 2020.', 2020, 1, CAST(N'2020-01-01' AS Date), CAST(N'2020-01-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (2002, N'фебруар 2020.', 2020, 2, CAST(N'2020-02-01' AS Date), CAST(N'2020-02-29' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (2003, N'март 2020.', 2020, 3, CAST(N'2020-03-01' AS Date), CAST(N'2020-03-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (2004, N'април 2020.', 2020, 4, CAST(N'2020-04-01' AS Date), CAST(N'2020-04-30' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (2005, N'мај 2020.', 2020, 5, CAST(N'2020-05-01' AS Date), CAST(N'2020-05-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (2006, N'јун 2020.', 2020, 6, CAST(N'2020-06-01' AS Date), CAST(N'2020-06-30' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (2007, N'јул 2020.', 2020, 7, CAST(N'2020-07-01' AS Date), CAST(N'2020-07-31' AS Date), 1, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (2008, N'август 2020.', 2020, 8, CAST(N'2020-08-01' AS Date), CAST(N'2020-08-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (2009, N'септембар 2020.', 2020, 9, CAST(N'2020-09-01' AS Date), CAST(N'2020-09-30' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (2010, N'октобар 2020.', 2020, 10, CAST(N'2020-10-01' AS Date), CAST(N'2020-10-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (2011, N'новембар 2020.', 2020, 11, CAST(N'2020-11-01' AS Date), CAST(N'2020-11-30' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (2012, N'децембар 2020.', 2020, 12, CAST(N'2020-12-01' AS Date), CAST(N'2020-12-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (2101, N'јануар 2021.', 2021, 1, CAST(N'2021-01-01' AS Date), CAST(N'2021-01-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (2102, N'фебруар 2021.', 2021, 2, CAST(N'2021-02-01' AS Date), CAST(N'2021-02-28' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (2103, N'март 2021.', 2021, 3, CAST(N'2021-03-01' AS Date), CAST(N'2021-03-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (2104, N'април 2021.', 2021, 4, CAST(N'2021-04-01' AS Date), CAST(N'2021-04-30' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (2105, N'мај 2021.', 2021, 5, CAST(N'2021-05-01' AS Date), CAST(N'2021-05-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (2106, N'јун 2021.', 2021, 6, CAST(N'2021-06-01' AS Date), CAST(N'2021-06-30' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (2107, N'јул 2021.', 2021, 7, CAST(N'2021-07-01' AS Date), CAST(N'2021-07-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (2108, N'август 2021.', 2021, 8, CAST(N'2021-08-01' AS Date), CAST(N'2021-08-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (2109, N'септембар 2021.', 2021, 9, CAST(N'2021-09-01' AS Date), CAST(N'2021-09-30' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (2110, N'октобар 2021.', 2021, 10, CAST(N'2021-10-01' AS Date), CAST(N'2021-10-31' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (2111, N'новембар 2021.', 2021, 11, CAST(N'2021-11-01' AS Date), CAST(N'2021-11-30' AS Date), 0, 0, 0)
GO
INSERT [BasicCatalog].[Period] ([Id], [Name], [Year], [Month], [DateFrom], [DateTo], [Active], [CalculationInProgress], [Archived]) VALUES (2112, N'децембар 2021.', 2021, 12, CAST(N'2021-12-01' AS Date), CAST(N'2021-12-31' AS Date), 0, 0, 0)
GO


SET IDENTITY_INSERT BasicCatalog.WorkUnit ON

INSERT BasicCatalog.WorkUnit 
    ([Id], [CompanyId], [DsoId], [PlaceId], [Name], [Address], [TaxId], [VatNumber], [Phone], [Fax], [Email], [WWW], [CallCenter], [BankAccount], [FailureReportingPhone])
VALUES 
    (1, 5, 1, 1, N'RJ Sarajevo',   NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (2, 5, 1, 1, N'RJ Banja Luka', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (3, 5, 1, 1, N'RJ Tuzla',      NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (4, 5, 1, 1, N'RJ Brcko',      NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
    (5, 5, 1, 1, N'RJ Prijedor',   NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL)

SET IDENTITY_INSERT BasicCatalog.WorkUnit OFF


SET IDENTITY_INSERT BasicCatalog.Street ON

Insert Into BasicCatalog.Street ([Id],[Name],[PrintName],[Valid])
Values (1,N'Hajduk Veljkova',N'',1)
,(2,N'Dr Mladena Stojanovica',N'',1)
,(3,N'Nepoznata ulica',N'Nepoznata ulica',1)
,(4,N'Trebevicka',N'Trebevicka',1)
,(5,N'Alberta Ajnstajna',N'Alberta Ajnstajna',1)
,(6,N'Nikole Tesle',N'Nikole Tesle',1)

SET IDENTITY_INSERT BasicCatalog.Street OFF

Insert Into BasicCatalog.PostOffice ([Id],[Name],[PrintName])
Values (71000,N'Sarajevo',N'')
,(71100,N'Sarajevo, Novo Sarajevo',N'')
,(71420,N'Pale',N'')
,(78000,N'Banja Luka',N'')

SET IDENTITY_INSERT BasicCatalog.Municipality ON

Insert Into BasicCatalog.Municipality ([Id],[EntityId],[Name])
Values (1,NULL,N'Banja Luka')
,(2,NULL,N'Sarajevo')
,(3,NULL,N'Pale')
,(4,NULL,N'Prijedor')
,(5,NULL,N'Bijeljina')
,(6,NULL,N'Mostar')
,(7,NULL,N'Tuzla')
,(8,NULL,N'Brcko')
,(9,NULL,N'Visegra')
,(0,NULL,N'Doboj')

SET IDENTITY_INSERT BasicCatalog.Municipality OFF

SET IDENTITY_INSERT BasicCatalog.Place ON

Insert Into BasicCatalog.Place ([Id],[EntityId],[MunicipalityId],[CountryId],[Name],[PrintName])
Values (1,1,1,N'BIH',N'Banja Luka',N'')
,(2,1,1,N'BIH',N'Sarajevo',N'')
,(3,1,1,N'BIH',N'Pale',N'')
,(4,1,1,N'BIH',N'Doboj',N'')
,(5,1,1,N'BIH',N'Brcko',N'')
,(6,1,1,N'BIH',N'Prijedor',N'')
,(7,1,1,N'BIH',N'Tuzla',N'')
,(8,1,1,N'BIH',N'Mostar',N'')
,(9,1,1,N'BIH',N'Neum',N'')
,(10,1,1,N'BIH',N'Visegrad',N'')

SET IDENTITY_INSERT BasicCatalog.Place OFF


SET IDENTITY_INSERT [BasicCatalog].[Activity] ON 

INSERT [BasicCatalog].[Activity] 
    ([Id], [ActivityCode], [Name], [PrintName]) 
VALUES 
    (1, N'D1', N'Djelatnost 1', N'Djelatnost 1'),
    (2, N'D2', N'Djelatnost 2', N'Djelatnost 2'),
    (3, N'D3', N'Djelatnost 3', N'Djelatnost 3'),
    (4, N'D4', N'Djelatnost 4', N'Djelatnost 4')

SET IDENTITY_INSERT [BasicCatalog].[Activity] OFF


SET IDENTITY_INSERT [BasicCatalog].[Company] ON 

INSERT [BasicCatalog].[Company] ([Id], [PlaceId], [PostOfficeId], [Name], [ShortName], [Address], [VatNumber], [TaxId], [Phone], [Fax], [Email], [Www], [CallCenter], [BankAccount]) VALUES (5, 1, 78000, N'World Power Plant', N'WPP', N'', NULL, N'17           ', N'', N'', N'', N'', NULL, NULL)

SET IDENTITY_INSERT [BasicCatalog].[Company] OFF


INSERT [BasicCatalog].[Country] ([Id], [Name]) VALUES (N'BIH', N'Bosna i Hercegovina')


INSERT [BasicCatalog].[DistributionSystemOperator] 
    ([Id], [Code], [Eic], [Name], [CostBearerSapCode], [SapAccount], [Address], [Email], [ContactNumber], [PhoneNumberForFaultApplication], [PhoneNumberForServiceInformation], [PhoneNumberForBillComplaint], [PrintName], [HasOperationalArea]) 
VALUES 
    (1, N'C', N'XXXXXXXXXXXXXXXX', N'New York', N'test', N'ads', NULL, NULL, NULL, N'', N'', N'', NULL, 0),
    (2, N'D', N'XXXXXXXXXXXXXXXX', N'Moscow',   N'test', N'ads', NULL, NULL, NULL, N'', N'', N'', NULL, 0),
    (3, N'H', N'XXXXXXXXXXXXXXXX', N'Tokyo',    N'test', N'ads', NULL, NULL, NULL, N'', N'', N'', NULL, 0),
    (4, N'K', N'XXXXXXXXXXXXXXXX', N'London',   N'test', N'ads', NULL, NULL, NULL, N'', N'', N'', NULL, 0),
    (5, N'P', N'XXXXXXXXXXXXXXXX', N'Berlin',   N'test', N'ads', NULL, NULL, NULL, N'', N'', N'', NULL, 0),
    (6, N'E', N'XXXXXXXXXXXXXXXX', N'Pale',     N'test', N'ads', NULL, NULL, NULL, N'', N'', N'', NULL, 0)


SET IDENTITY_INSERT [Administration].[User] ON 

INSERT [Administration].[User] ([Id], [Username], [PasswordSalt], [PasswordHash], [Name], [Surname], [Active], [SystemUser], [SystemAdmin], [DsoIdDataOnly], [Hidden]) VALUES (1, N'admin1', 0xD9E4C3B15031AAEBD44FBD12E8DFB8464E1BA41DB82D3242F6ECE09F95DF464A6E4850F1347682B95FE51F82D32D63949DD1A335ED1F0CD2C104489CB7C6D747E2B61C79037523A63A16AEEF7397D7908775103A91F92BEE03EAACAE3936843B49B4047B9A71D50330BC8F76486275561629608CA406239B1A1D9E4DD7948E97, 0xD2727738F30C7A98A58D37BD3F73F936E845288F60B74899BAD432057F3D46CF948F18642B26877DCF76223CA30515FC4B4BB3521CBC4D6444938DD7475D5AB2, N'Adminko', N'Adminković', 1, 0, 1, NULL, 0)
INSERT [Administration].[User] ([Id], [Username], [PasswordSalt], [PasswordHash], [Name], [Surname], [Active], [SystemUser], [SystemAdmin], [DsoIdDataOnly], [Hidden]) VALUES (3, N'admin', 0xD9E4C3B15031AAEBD44FBD12E8DFB8464E1BA41DB82D3242F6ECE09F95DF464A6E4850F1347682B95FE51F82D32D63949DD1A335ED1F0CD2C104489CB7C6D747E2B61C79037523A63A16AEEF7397D7908775103A91F92BEE03EAACAE3936843B49B4047B9A71D50330BC8F76486275561629608CA406239B1A1D9E4DD7948E97, 0xD2727738F30C7A98A58D37BD3F73F936E845288F60B74899BAD432057F3D46CF948F18642B26877DCF76223CA30515FC4B4BB3521CBC4D6444938DD7475D5AB2, N'Adminko', N'Adminković', 1, 1, 1, NULL, 0)
INSERT [Administration].[User] ([Id], [Username], [PasswordSalt], [PasswordHash], [Name], [Surname], [Active], [SystemUser], [SystemAdmin], [DsoIdDataOnly], [Hidden]) VALUES (1004, N'string', 0xB2135CA5582DD867C618AAFE32311ADAA5468A06B68FC05D85DED0FB19DD1494932FB7D1C66DFA34FE058D7F7AC12F79EC69AD4AB7F77CFEF73D94BF9F42D084A9C86656056E5C4BBA0B9D793E73BB82A8FC039B9C15485005171E4497F6A44384EA94D9BF877F67519EB8AC3378406EFCE8684DDDD05F9C007514DCA736AA6F, 0xB9D2E93DB4EAAE9547B915CF9997F67B95FEDD0A3F9EA4A344EA29D33AAB3960268CE759CE7A7A44CE060C8734596B14D3DF80AD2D105B6E20DEFCDA7B9AE621, N'11321', N'333', 1, 0, 0, 1, 0)
INSERT [Administration].[User] ([Id], [Username], [PasswordSalt], [PasswordHash], [Name], [Surname], [Active], [SystemUser], [SystemAdmin], [DsoIdDataOnly], [Hidden]) VALUES (2004, N'string1', 0x49BD61AA454E777D89D9EBF30564C03F754BA53272A56331564727D797FB28899BCB4922B699FF0A2AF0FFA21CFEC0523238DF57380062732180040B89C5D2415E3D6737E36EE07653895F4FC3549FB43F0D0B2E2DFE131C52B4C555362645ED26032A757232B58DDC3E59121137D89DADF0290BFBC57C017BBC212E9F662E30, 0xB8DCB995254BD19765A954CB09EC0300C8D1FCA4F56820A7CAD08A0B79BDA80094A8D76289F5B643B5C839AB8426DE7A60A788D734258588FCD30095C52FBF56, N'string', N'test', 1, 0, 0, NULL, 0)
INSERT [Administration].[User] ([Id], [Username], [PasswordSalt], [PasswordHash], [Name], [Surname], [Active], [SystemUser], [SystemAdmin], [DsoIdDataOnly], [Hidden]) VALUES (2005, N'aragorn', 0xEB521077566AFABC70000D5A0B2D2A6055ADE3F764AA95964EE97A307DAEE2FAB383663719994B491864EADB09AB2BA45CA5904A4770B5F00B3631BBFA1BE8B788C2D0ED3E17790B7BD7E13ACE7BE037977D8E5FC80B96A89F31DD3819A184E54832988577D92E7F948E3EE868FB49C789BAE152A4DE7762B67F934691DE5CA4, 0x4A72CD6E079B2846A001395788E153DD10E999A86352724EF649BE7DBD563F4D1623864005E84977DAD3B2AD0DAED3D4D8AEAE12536F8060A55DB656A73C15D5, N'Aragorn', N'Elessar', 1, 0, 0, 1, 0)
INSERT [Administration].[User] ([Id], [Username], [PasswordSalt], [PasswordHash], [Name], [Surname], [Active], [SystemUser], [SystemAdmin], [DsoIdDataOnly], [Hidden]) VALUES (2006, N'Djokas', 0xB86F9C976A0880DA9779D9694DF158A63B238FF9CF0371498557579D9C9023CAFE0EA56E6D26F8AD00D7F8CFA40D1C2109B432E7081BE4ACF06823281AA3F1D8BF377F2805879A67598EEB7CC4EC54868BC248CD95749D566A198912D06A8BA0E20FFA7208617B12F5EB48487CB1AC489B524AF657D9015FC276D94355AC01B5, 0xEBC5E0AD3E36CF8CC6094A825C109ED7393D4CA79972E16DCC5029A10E5DD6D379A7E5A7035C27025F68F4BC26144B320F346DE57FFCD6BC447B6A41474F7E7D, N'Djordje', N'Djokan', 1, 0, 0, 1, 0)
INSERT [Administration].[User] ([Id], [Username], [PasswordSalt], [PasswordHash], [Name], [Surname], [Active], [SystemUser], [SystemAdmin], [DsoIdDataOnly], [Hidden]) VALUES (2007, N'aljbin', 0x8D3A9BCDFAEAEDFBDA733239E4B1025E8FD440C04CBED62BA439DF487A77D43C44DA1E67CCF45D647F8069CDA00D26E2B012207914667595DB054A948C3BC699EF3C3479EB10070FB1BD109F4D5ADA06DD5DEE81BB2CC11B4A29C7FC93F8FAEF05B8C6822CE2A63A1BD8ED1C157E44F0D0E98D7488AA8508B9A0994D5724E6E3, 0xBE33A78A10F816025BB8075E359C0A2A43B9D23DCB949759C3BB8EA5ED77992F9EF210683DCC6B53152DD100C344ACDFD3AB24EC2F63ABC23CBB4D307F7B53CF, N'aljbin', N'kurti', 1, 0, 0, NULL, 0)
INSERT [Administration].[User] ([Id], [Username], [PasswordSalt], [PasswordHash], [Name], [Surname], [Active], [SystemUser], [SystemAdmin], [DsoIdDataOnly], [Hidden]) VALUES (2008, N'nebojsa.milojevic', 0x0579E99752FE2E5D5F6058D36EF301F1B354F729BB55A905BDE64BC2A3F44CB543BA532ED8FAFA6CC31BDD84F36715CFDF958F5233F85214ABE038713BCE41E31F3C2FF1BE53F718309CF2C29FDAE87BB7160F6BBAD39A8A4E88BEE636806EA8654F514E4ADDF52F693A9F109AD0DEFEA8F3F57324744D57D3F46A519DA71DC5, 0x9360E42EEC6AF70694AC7882A5928DC35BF6C8F0944A6AA742F02A384EE22CF49F45BE6A833655399CFB2C384CC32A22337F50E018F7035BD86520BD4ADA8911, N'Nebojša', N'Milojević', 1, 0, 0, NULL, 0)

SET IDENTITY_INSERT [Administration].[User] OFF


SET IDENTITY_INSERT [Administration].[Message] ON 

INSERT [Administration].[Message] 
    ([Id], [Title], [Body], [DateFrom], [DateTo], [Priority], [DsoId], [UserId])
VALUES 
    (2, N'Poruka testne prirode', N'<p>Testna poruka</p>', '2020-10-15 12:00:00.000', NULL, 1, NULL, NULL)

SET IDENTITY_INSERT [Administration].[Message] OFF


SET IDENTITY_INSERT [Administration].ContractNumberTemplate ON 

INSERT [Administration].[ContractNumberTemplate] 
    ([Id], [DsoId], [ContractNumberTemplateGroupId], [Template], [DateFrom], [DateTo], [NextOrderNumber])
VALUES 
    (1, 1, 1, N'Broj - {{orderNumber}} - A', '2020-01-01', NULL, 0)

SET IDENTITY_INSERT [Administration].ContractNumberTemplate OFF

INSERT [Administration].[ModuleGroup]([Id],[ParentId], [Name], [SortPosition]) VALUES (1, NULL,N'Test grupa',1)

INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (1, N'Administracija', N'Px.Application.Services.Administrations',2,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (2, N'Analitika', N'Px.Application.Services.Analytics',3,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (3, N'Šifarnici', N'Px.Application.Services.BasicCatalogs',4,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (4, N'Obračun', N'Px.Application.Services.Calculations',5,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (5, N'Kupci', N'Px.Application.Services.Customers',6,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (6, N'Finansije', N'Px.Application.Services.Finances',7,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (7, N'Mjerna mjesta', N'Px.Application.Services.Metering',8,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (9, N'Tarifni sistem', N'Px.Application.Services.TariffSystem',9,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (10, N'Promjena datuma važenja ugovora', N'Px.Application.Services.Customers.Contracts.Commands.ChangeValidityDateOnContract',10,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (11, N'Pravni odnosi', N'Px.Application.Services.Legal',11,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (12, N'Reprogrami', N'Px.Application.Services.Finances.DebtRestructure',12,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (13, N'Finansijski šifarnici', N'Px.Application.Services.FinancialCodebook',13,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (14, N'Rješavanje zahtjeva za održavanjem', N'Px.Application.Services.Administrations.MaintenanceRequestResolving',14,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (15, N'Zajednička potrošnja', N'Px.Application.Services.Calculations.RegularConsumption.CommonConsumption',15,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (16, N'Zahtjevi za održavanje', N'Px.Application.Services.Administrations.MaintenanceRequests',16,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (17, N'Zahtjevi za ugovor', N'Px.Application.Services.Customers.ContractRequests',17,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (18, N'Zahtjevi za raskid ugovora', N'Px.Application.Services.Customers.EndOfSupplyRequests',18,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (19, N'Potpisivanje ugovora', N'Px.Application.Services.Customers.Contracts.Commands.SignContract',19,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (20, N'Eksterni interfejsi', N'Px.Application.Services.Finances.ExternalInterfaces',20,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (21, N'Sravnivanje mjernog mjesta avansom', N'Px.Application.Services.Finances.AdvancePayment.Commands.BalanceDebitWithAdvancePayment',21,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (22, N'Obnova ugovora', N'Px.Application.Services.Customers.Contracts.Commands.RenewContract',22,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (23, N'Korekcija kamate', N'Px.Application.Services.Finances.InterestCorrections',23,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (24, N'Zaključivanje dnevnika', N'Px.Application.Services.Finances.PaymentJournals.PaymentJournals.Commands.ClosePaymentJournal',24,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (25, N'Objedinjavanje kupaca', N'Px.Application.Services.Customers.Customers.Shared.Commands.UnifyCustomer',25,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (26, N'Nestandardne usluge', N'Px.Application.Services.Calculations.NonStandardServices',26,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (27, N'Isključenja-uključenja', N'Px.Application.Services.ContractOutageInclusions',27,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (28, N'Mjenice', N'Px.Application.Services.Customers.BillOfExchanges',28,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (29, N'Promjena teritorijalne pripadnosti', N'Px.Application.Services.Metering.MeteringPoints.Commands.ChangeTerritorialAffiliation',29,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (30, N'Obnovi ugovor uz obavještenje ODS-a', N'Px.Application.Services.Customers.Contracts.Commands.RenewContractAndNotifyDso',30,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (31, N'Korekcija računa', N'Px.Application.Services.Calculations.RegularConsumption.BillCorrections',31,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (32, N'Otključavanje reklamacije', N'Px.Application.Services.Customers.Complaints.Commands.OpenComplaint',32,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (33, N'Zahtjev za uključenje na zahtjev kupca', N'Px.Application.Services.ContractOutageInclusions.ContractInclusionRequests.Commands.CreateCustomerInitiatedContractInclusionRequest',33,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (34, N'Zahtjev za isključenje na zahtjev kupca', N'Px.Application.Services.ContractOutageInclusions.ContractOutageRequests.Commands.CreateCustomerInitiatedContractOutageRequest',34,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (35, N'Potvrđivanje tužbe', N'Px.Application.Services.Legal.Accusations.Commands.ConfirmAccusation',35,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (36, N'Masovno knjiženje korekcija kamate', N'Px.Application.Services.Finances.InterestCorrections.Commands.MassCloseInterestCorrection',36,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (37, N'Kupci - proizvođači', N'Px.Application.Services.Prosumers',37,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (38, N'Promjena pravnog lica na fizičko', N'Px.Application.Services.Customers.Customers.Shared.Commands.ChangeCustomerLegalityStatusFromLegal',38,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (39, N'Promjena fizičkog lica na pravno', N'Px.Application.Services.Customers.Customers.Shared.Commands.ChangeCustomerLegalityStatusToLegal',39,1)
INSERT [Administration].[Module] ([Id], [Name], [Namespace],[SortPosition],[ModuleGroupId]) VALUES (40, N'Anketari', N'Px.Application.Services.Prosumers.Interviewers',40,1)


SET IDENTITY_INSERT [Administration].UserModule ON

Insert Into Administration.UserModule ([Id],[UserId],[ModuleId],[Write],[Delete])
Values (3,1,1,1,1)
,(4,1,2,1,1)
,(5,1,3,1,1)
,(70,2004,1,1,1)
,(79,2005,1,1,1)
,(80,2005,2,1,1)
,(81,2005,3,1,1)
,(82,2005,4,1,1)
,(83,2005,5,1,1)
,(84,2005,6,0,0)
,(85,2005,7,1,1)
,(86,2005,9,1,1)
,(87,2006,1,0,0)
,(88,2006,2,0,0)
,(89,2006,3,0,0)
,(90,2006,4,0,0)
,(91,2007,1,0,0)
,(92,2007,2,0,0)
,(93,2007,3,0,0)
,(94,2007,4,0,0)
,(95,2007,5,0,0)
,(96,2007,6,0,0)
,(97,2007,7,0,0)
,(98,2007,9,0,0)
,(99,2008,2,1,1)
,(100,2008,3,1,1)
,(101,2008,4,1,1)
,(102,2008,5,1,1)
,(103,2008,6,1,1)
,(104,2008,7,1,1)
,(105,2008,9,1,1)
-----------------
,(106,2008,10,1,1)
,(107,2008,11,1,1)
,(108,2008,12,1,1)
,(109,2008,13,1,1)
,(110,2008,26,1,1)
------------------
,(111,2008,17,1,1)
,(112,2008,18,1,1)
,(113,2008,15,1,1)
,(114,2008,27,1,1)
,(115,2008,1,1,1)
,(116,2008,28,1,1)
,(118,2008,23,1,1)
,(119,2008,33,1,1)
,(120,2008,20,1,1)
,(121,2008,35,1,1)
,(122,2008,36,1,1)
,(123,2008,37,1,1)
,(124,2008,38,1,1)
,(125,2008,39,1,1)
,(126,2008,40,1,1)

SET IDENTITY_INSERT [Administration].UserModule OFF


SET IDENTITY_INSERT [Calculation].[CalculationType] ON

INSERT INTO [Calculation].[CalculationType] 
    ([Id], [Name], [PrintName]) 
VALUES 
    (1, N'Redovna potrošnja', N'Redovna potrošnja'),
    (2, N'Nestandardne usluge', N'Nestandardne usluge')

SET IDENTITY_INSERT [Calculation].[CalculationType] OFF


INSERT [Calculation].[BillOrder] ([Id], [PeriodId], [DsoId], [Date], [SeasonId], [DateOfPayment], [AmountWithoutTax], [Tax], [AmountWithTax], [NumberOfCustomers], [NumberOfMeteringPoints], [NumberOfBills], [Note], [Closed],[GeneratedAdvancePaymentInvoiceFiles], [CalculationTypeId], [ForPrint]) VALUES (202007, 2007, NULL, CAST(N'2020-07-31' AS Date), N'S', CAST(N'2020-11-25' AS Date), CAST(0.00 AS Decimal(14, 2)), CAST(0.00 AS Decimal(10, 2)), CAST(0.00 AS Decimal(14, 2)), 0, 0, 0, NULL, 1, 0, 1, 1)
INSERT [Calculation].[BillOrder] ([Id], [PeriodId], [DsoId], [Date], [SeasonId], [DateOfPayment], [AmountWithoutTax], [Tax], [AmountWithTax], [NumberOfCustomers], [NumberOfMeteringPoints], [NumberOfBills], [Note], [Closed],[GeneratedAdvancePaymentInvoiceFiles], [CalculationTypeId], [ForPrint]) VALUES (202010, 2010, NULL, CAST(N'2020-10-31' AS Date), N'S', CAST(N'2020-11-25' AS Date), CAST(0.00 AS Decimal(14, 2)), CAST(0.00 AS Decimal(10, 2)), CAST(0.00 AS Decimal(14, 2)), 0, 0, 0, NULL, 0, 0, 1, 1)


INSERT [Calculation].[Bill] ([Id], [BillOrderId], [ContractId], [TariffGroupId], [DsoId], [CustomerId], [CustomerName], [MeteringPointId], [EIC], [MeteringPointName], [VatPayer], [AssociatedLegalEntities], [IsForLegalEntity], [TaxId], [VatNumber], [DateOfBill], [DateOfPayment], [SerialNumber], [NumberOfBillInYear], [RecapitulationReferenceNumber], [ReferenceNumber], [MeteringPointInDsoId], [DateOfPreviousReading], [DateOfReading], [Energy], [EnergyVat], [Netting], [NettingVat], [RenewableElectricity], [RenewableElectricityVat], [SupplyFee], [SupplyFeeVat], [CommonConsumption], [CommonConsumptionVat], [AmountWithoutVat], [Vat], [AmountWithVat], [Interest], [TotalBillAmount], [PreviousBalance], [PaymentsInPeriod], [CorrectionsInPeriod], [TotalForPayment], [OverdueNotification], [Recapitulation], [DeliveryPath], [DeliveryAddress], [EmailForDelivery], [EmailDelivery], [CommonConsumptionGroupId], [BillForPeriodId], [CalculationTypeId], [NonStandardService], [NonStandardServiceVat], [ForPrint], [PercentageHT], [PercentageLT], [ReactiveEnergyBillingExemption], [BillForCorrection], [OriginalCustomerId], [PreviousBalanceOtherBookingType]) VALUES (1270, 202007, 200008, 1, 6, 2100267, N'Prevoz Dwelt', 62100355, N'36ZTZDM         ', N'Avioprevoz Dwelt', 1, 0, 0, NULL, NULL, CAST(N'2019-10-31' AS Date), CAST(N'2019-11-25' AS Date), N'1271', 1271, NULL, N'1270', 31033756, CAST(N'2019-09-30' AS Date), CAST(N'2019-10-31' AS Date), CAST(10716.52 AS Decimal(12, 2)), CAST(1821.81 AS Decimal(12, 2)), CAST(5566.91 AS Decimal(12, 2)), CAST(946.37 AS Decimal(12, 2)), CAST(989.30 AS Decimal(12, 2)), CAST(168.18 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(0.00 AS Decimal(14, 2)), CAST(0.00 AS Decimal(14, 2)), CAST(17272.73 AS Decimal(14, 2)), CAST(2936.36 AS Decimal(12, 2)), CAST(20209.09 AS Decimal(14, 2)), CAST(0.00 AS Decimal(14, 2)), CAST(20209.09 AS Decimal(14, 2)), CAST(0.00 AS Decimal(14, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(20209.09 AS Decimal(14, 2)), 0, 0, NULL, N'Neka adresa', NULL, 0, NULL, 2007, 1, CAST(0.00 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)), 1, CAST(0.00 AS Decimal(5, 2)), CAST(0.00 AS Decimal(5, 2)), 0, 0, 2100267, 0.00)
INSERT [Calculation].[Bill] ([Id], [BillOrderId], [ContractId], [TariffGroupId], [DsoId], [CustomerId], [CustomerName], [MeteringPointId], [EIC], [MeteringPointName], [VatPayer], [AssociatedLegalEntities], [IsForLegalEntity], [TaxId], [VatNumber], [DateOfBill], [DateOfPayment], [SerialNumber], [NumberOfBillInYear], [RecapitulationReferenceNumber], [ReferenceNumber], [MeteringPointInDsoId], [DateOfPreviousReading], [DateOfReading], [Energy], [EnergyVat], [Netting], [NettingVat], [RenewableElectricity], [RenewableElectricityVat], [SupplyFee], [SupplyFeeVat], [CommonConsumption], [CommonConsumptionVat], [AmountWithoutVat], [Vat], [AmountWithVat], [Interest], [TotalBillAmount], [PreviousBalance], [PaymentsInPeriod], [CorrectionsInPeriod], [TotalForPayment], [OverdueNotification], [Recapitulation], [DeliveryPath], [DeliveryAddress], [EmailForDelivery], [EmailDelivery], [CommonConsumptionGroupId], [BillForPeriodId], [CalculationTypeId], [NonStandardService], [NonStandardServiceVat], [ForPrint], [PercentageHT], [PercentageLT], [ReactiveEnergyBillingExemption], [BillForCorrection], [OriginalCustomerId], [PreviousBalanceOtherBookingType]) VALUES (1274, 202007, 600001, 1, 6, 4100010, N'Avioprevoz Dwelt', 66100001, N'36BL13          ', N'Prevoz Dwelt', 1, 0, 0, NULL, NULL, CAST(N'2019-10-31' AS Date), CAST(N'2019-11-25' AS Date), N'1275', 1275, NULL, N'1274', 66100001, CAST(N'2019-09-30' AS Date), CAST(N'2019-10-31' AS Date), CAST(17579.09 AS Decimal(12, 2)), CAST(2988.45 AS Decimal(12, 2)), CAST(6172.36 AS Decimal(12, 2)), CAST(1049.30 AS Decimal(12, 2)), CAST(1668.60 AS Decimal(12, 2)), CAST(283.66 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)),CAST(0.00 AS Decimal(14, 2)), CAST(0.00 AS Decimal(14, 2)), CAST(25420.05 AS Decimal(14, 2)), CAST(4321.41 AS Decimal(12, 2)), CAST(29741.46 AS Decimal(14, 2)), CAST(0.00 AS Decimal(14, 2)), CAST(29741.46 AS Decimal(14, 2)), CAST(0.00 AS Decimal(14, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(29741.46 AS Decimal(14, 2)), 0, 0, NULL, N'Neka adresa', NULL, 0, NULL, 2007, 1, CAST(0.0 AS Decimal(12, 2)), CAST(0.0 AS Decimal(12, 2)), 1, CAST(0.00 AS Decimal(5, 2)), CAST(0.00 AS Decimal(5, 2)), 0, 0, 4100010, 0.00)
INSERT [Calculation].[Bill] ([Id], [BillOrderId], [ContractId], [TariffGroupId], [DsoId], [CustomerId], [CustomerName], [MeteringPointId], [EIC], [MeteringPointName], [VatPayer], [AssociatedLegalEntities], [IsForLegalEntity], [TaxId], [VatNumber], [DateOfBill], [DateOfPayment], [SerialNumber], [NumberOfBillInYear], [RecapitulationReferenceNumber], [ReferenceNumber], [MeteringPointInDsoId], [DateOfPreviousReading], [DateOfReading], [Energy], [EnergyVat], [Netting], [NettingVat], [RenewableElectricity], [RenewableElectricityVat], [SupplyFee], [SupplyFeeVat], [CommonConsumption], [CommonConsumptionVat], [AmountWithoutVat], [Vat], [AmountWithVat], [Interest], [TotalBillAmount], [PreviousBalance], [PaymentsInPeriod], [CorrectionsInPeriod], [TotalForPayment], [OverdueNotification], [Recapitulation], [DeliveryPath], [DeliveryAddress], [EmailForDelivery], [EmailDelivery], [CommonConsumptionGroupId], [BillForPeriodId], [CalculationTypeId], [NonStandardService], [NonStandardServiceVat], [ForPrint], [PercentageHT], [PercentageLT], [ReactiveEnergyBillingExemption], [BillForCorrection], [OriginalCustomerId], [PreviousBalanceOtherBookingType]) VALUES (1275, 202007, 600002, 1, 6, 4100010, N'Avioprevoz Dwelt', 66100002, N'36BL13B         ', N'Prevoz Dwelt', 1, 0, 0, NULL, NULL, CAST(N'2019-10-31' AS Date), CAST(N'2019-11-25' AS Date), N'1276', 1276, NULL, N'1275', 66100002, CAST(N'2019-09-30' AS Date), CAST(N'2019-10-31' AS Date), CAST(13269.07 AS Decimal(12, 2)), CAST(2255.74 AS Decimal(12, 2)), CAST(1858.93 AS Decimal(12, 2)), CAST(316.02 AS Decimal(12, 2)), CAST(1270.34 AS Decimal(12, 2)), CAST(215.96 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)),CAST(0.00 AS Decimal(14, 2)), CAST(0.00 AS Decimal(14, 2)), CAST(16398.34 AS Decimal(14, 2)), CAST(2787.72 AS Decimal(12, 2)), CAST(19186.06 AS Decimal(14, 2)), CAST(0.00 AS Decimal(14, 2)), CAST(19186.06 AS Decimal(14, 2)), CAST(0.00 AS Decimal(14, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(19186.06 AS Decimal(14, 2)), 0, 0, NULL, N'Neka adresa', NULL, 0, NULL, 2007, 1, CAST(0.0 AS Decimal(12, 2)), CAST(0.0 AS Decimal(12, 2)), 1, CAST(0.00 AS Decimal(5, 2)), CAST(0.00 AS Decimal(5, 2)), 0, 0, 4100010, 0.00)
INSERT [Calculation].[Bill] ([Id], [BillOrderId], [ContractId], [TariffGroupId], [DsoId], [CustomerId], [CustomerName], [MeteringPointId], [EIC], [MeteringPointName], [VatPayer], [AssociatedLegalEntities], [IsForLegalEntity], [TaxId], [VatNumber], [DateOfBill], [DateOfPayment], [SerialNumber], [NumberOfBillInYear], [RecapitulationReferenceNumber], [ReferenceNumber], [MeteringPointInDsoId], [DateOfPreviousReading], [DateOfReading], [Energy], [EnergyVat], [Netting], [NettingVat], [RenewableElectricity], [RenewableElectricityVat], [SupplyFee], [SupplyFeeVat], [CommonConsumption], [CommonConsumptionVat], [AmountWithoutVat], [Vat], [AmountWithVat], [Interest], [TotalBillAmount], [PreviousBalance], [PaymentsInPeriod], [CorrectionsInPeriod], [TotalForPayment], [OverdueNotification], [Recapitulation], [DeliveryPath], [DeliveryAddress], [EmailForDelivery], [EmailDelivery], [CommonConsumptionGroupId], [BillForPeriodId], [CalculationTypeId], [NonStandardService], [NonStandardServiceVat], [ForPrint], [PercentageHT], [PercentageLT], [ReactiveEnergyBillingExemption], [BillForCorrection], [OriginalCustomerId], [PreviousBalanceOtherBookingType]) VALUES (1276, 202007, 600003, 1, 6, 4100010, N'Avioprevoz Dwelt', 66100003, N'36ZBL17         ', N'Prevoz Dwelt', 1, 0, 0, NULL, NULL, CAST(N'2019-10-31' AS Date), CAST(N'2019-11-25' AS Date), N'1277', 1277, NULL, N'1276', 66100003, CAST(N'2019-09-30' AS Date), CAST(N'2019-10-31' AS Date), CAST(2056.60 AS Decimal(12, 2)), CAST(349.62 AS Decimal(12, 2)), CAST(263.09 AS Decimal(12, 2)), CAST(44.73 AS Decimal(12, 2)), CAST(179.78 AS Decimal(12, 2)), CAST(30.56 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)),CAST(0.00 AS Decimal(14, 2)), CAST(0.00 AS Decimal(14, 2)), CAST(2499.47 AS Decimal(14, 2)), CAST(424.91 AS Decimal(12, 2)), CAST(2924.38 AS Decimal(14, 2)), CAST(0.00 AS Decimal(14, 2)), CAST(2924.38 AS Decimal(14, 2)), CAST(0.00 AS Decimal(14, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(2924.38 AS Decimal(14, 2)), 0, 0, NULL, N'Neka adresa', NULL, 0, NULL, 2007, 1, CAST(0.0 AS Decimal(12, 2)), CAST(0.0 AS Decimal(12, 2)), 1, CAST(0.00 AS Decimal(5, 2)), CAST(0.00 AS Decimal(5, 2)), 0, 0, 4100010, 0.00)
INSERT [Calculation].[Bill] ([Id], [BillOrderId], [ContractId], [TariffGroupId], [DsoId], [CustomerId], [CustomerName], [MeteringPointId], [EIC], [MeteringPointName], [VatPayer], [AssociatedLegalEntities], [IsForLegalEntity], [TaxId], [VatNumber], [DateOfBill], [DateOfPayment], [SerialNumber], [NumberOfBillInYear], [RecapitulationReferenceNumber], [ReferenceNumber], [MeteringPointInDsoId], [DateOfPreviousReading], [DateOfReading], [Energy], [EnergyVat], [Netting], [NettingVat], [RenewableElectricity], [RenewableElectricityVat], [SupplyFee], [SupplyFeeVat], [CommonConsumption], [CommonConsumptionVat], [AmountWithoutVat], [Vat], [AmountWithVat], [Interest], [TotalBillAmount], [PreviousBalance], [PaymentsInPeriod], [CorrectionsInPeriod], [TotalForPayment], [OverdueNotification], [Recapitulation], [DeliveryPath], [DeliveryAddress], [EmailForDelivery], [EmailDelivery], [CommonConsumptionGroupId], [BillForPeriodId], [CalculationTypeId], [NonStandardService], [NonStandardServiceVat], [ForPrint], [PercentageHT], [PercentageLT], [ReactiveEnergyBillingExemption], [BillForCorrection], [OriginalCustomerId], [PreviousBalanceOtherBookingType]) VALUES (1277, 202007, 600004, 1, 6, 4100010, N'Avioprevoz Dwelt', 66100004, N'LUK3B24         ', N'Prevoz Dwelt', 1, 0, 0, NULL, NULL, CAST(N'2019-10-31' AS Date), CAST(N'2019-11-25' AS Date), N'1278', 1278, NULL, N'1277', 66100004, CAST(N'2019-09-30' AS Date), CAST(N'2019-10-31' AS Date), CAST(27418.10 AS Decimal(12, 2)), CAST(4661.08 AS Decimal(12, 2)), CAST(6198.71 AS Decimal(12, 2)), CAST(1053.78 AS Decimal(12, 2)), CAST(2636.00 AS Decimal(12, 2)), CAST(448.12 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(0.00 AS Decimal(14, 2)),CAST(0.00 AS Decimal(14, 2)), CAST(36252.81 AS Decimal(14, 2)), CAST(6162.98 AS Decimal(12, 2)), CAST(42415.79 AS Decimal(14, 2)), CAST(0.00 AS Decimal(14, 2)), CAST(42415.79 AS Decimal(14, 2)), CAST(0.00 AS Decimal(14, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(42415.79 AS Decimal(14, 2)), 0, 0, NULL, N'Neka adresa', NULL, 0, NULL, 2007, 1, CAST(0.0 AS Decimal(12, 2)), CAST(0.0 AS Decimal(12, 2)), 1, CAST(0.00 AS Decimal(5, 2)), CAST(0.00 AS Decimal(5, 2)), 0, 0, 4100010, 0.00)
INSERT [Calculation].[Bill] ([Id], [BillOrderId], [ContractId], [TariffGroupId], [DsoId], [CustomerId], [CustomerName], [MeteringPointId], [EIC], [MeteringPointName], [VatPayer], [AssociatedLegalEntities], [IsForLegalEntity], [TaxId], [VatNumber], [DateOfBill], [DateOfPayment], [SerialNumber], [NumberOfBillInYear], [RecapitulationReferenceNumber], [ReferenceNumber], [MeteringPointInDsoId], [DateOfPreviousReading], [DateOfReading], [Energy], [EnergyVat], [Netting], [NettingVat], [RenewableElectricity], [RenewableElectricityVat], [SupplyFee], [SupplyFeeVat], [CommonConsumption], [CommonConsumptionVat], [AmountWithoutVat], [Vat], [AmountWithVat], [Interest], [TotalBillAmount], [PreviousBalance], [PaymentsInPeriod], [CorrectionsInPeriod], [TotalForPayment], [OverdueNotification], [Recapitulation], [DeliveryPath], [DeliveryAddress], [EmailForDelivery], [EmailDelivery], [CommonConsumptionGroupId], [BillForPeriodId], [CalculationTypeId], [NonStandardService], [NonStandardServiceVat], [ForPrint], [PercentageHT], [PercentageLT], [ReactiveEnergyBillingExemption], [BillForCorrection], [OriginalCustomerId], [PreviousBalanceOtherBookingType]) VALUES (1278, 202007, 600005, 1, 6, 4100010, N'Avioprevoz Dwelt', 66100005, N'36Z53B1Z        ', N'Prevoz Dwelt', 1, 0, 0, NULL, NULL, CAST(N'2019-10-31' AS Date), CAST(N'2019-11-25' AS Date), N'1279', 1279, NULL, N'1278', 66100005, CAST(N'2019-09-30' AS Date), CAST(N'2019-10-31' AS Date), CAST(25724.68 AS Decimal(12, 2)), CAST(4373.20 AS Decimal(12, 2)), CAST(7277.43 AS Decimal(12, 2)), CAST(1237.16 AS Decimal(12, 2)), CAST(2437.05 AS Decimal(12, 2)), CAST(414.30 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)),CAST(0.00 AS Decimal(14, 2)), CAST(0.00 AS Decimal(14, 2)), CAST(35439.16 AS Decimal(14, 2)), CAST(6024.66 AS Decimal(12, 2)), CAST(41463.82 AS Decimal(14, 2)), CAST(0.00 AS Decimal(14, 2)), CAST(41463.82 AS Decimal(14, 2)), CAST(0.00 AS Decimal(14, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(41463.82 AS Decimal(14, 2)), 0, 0, NULL, N'Neka adresa', NULL, 0, NULL, 2007, 1, CAST(0.0 AS Decimal(12, 2)), CAST(0.0 AS Decimal(12, 2)), 1, CAST(0.00 AS Decimal(5, 2)), CAST(0.00 AS Decimal(5, 2)), 0, 0, 4100010, 0.00)
INSERT [Calculation].[Bill] ([Id], [BillOrderId], [ContractId], [TariffGroupId], [DsoId], [CustomerId], [CustomerName], [MeteringPointId], [EIC], [MeteringPointName], [VatPayer], [AssociatedLegalEntities], [IsForLegalEntity], [TaxId], [VatNumber], [DateOfBill], [DateOfPayment], [SerialNumber], [NumberOfBillInYear], [RecapitulationReferenceNumber], [ReferenceNumber], [MeteringPointInDsoId], [DateOfPreviousReading], [DateOfReading], [Energy], [EnergyVat], [Netting], [NettingVat], [RenewableElectricity], [RenewableElectricityVat], [SupplyFee], [SupplyFeeVat], [CommonConsumption], [CommonConsumptionVat], [AmountWithoutVat], [Vat], [AmountWithVat], [Interest], [TotalBillAmount], [PreviousBalance], [PaymentsInPeriod], [CorrectionsInPeriod], [TotalForPayment], [OverdueNotification], [Recapitulation], [DeliveryPath], [DeliveryAddress], [EmailForDelivery], [EmailDelivery], [CommonConsumptionGroupId], [BillForPeriodId], [CalculationTypeId], [NonStandardService], [NonStandardServiceVat], [ForPrint], [PercentageHT], [PercentageLT], [ReactiveEnergyBillingExemption], [BillForCorrection], [OriginalCustomerId], [PreviousBalanceOtherBookingType]) VALUES (1280, 202007, 600007, 1, 6, 4100010, N'Avioprevoz Dwelt', 66100007, N'36ZBLNG         ', N'Prevoz Dwelt', 1, 0, 0, NULL, NULL, CAST(N'2019-10-31' AS Date), CAST(N'2019-11-25' AS Date), N'1281', 1281, NULL, N'1280', 66100007, CAST(N'2019-09-30' AS Date), CAST(N'2019-10-31' AS Date), CAST(9147.65 AS Decimal(12, 2)), CAST(1555.10 AS Decimal(12, 2)), CAST(1603.88 AS Decimal(12, 2)), CAST(272.66 AS Decimal(12, 2)), CAST(863.68 AS Decimal(12, 2)), CAST(146.83 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)),CAST(0.00 AS Decimal(14, 2)), CAST(0.00 AS Decimal(14, 2)), CAST(11615.21 AS Decimal(14, 2)), CAST(1974.59 AS Decimal(12, 2)), CAST(13589.80 AS Decimal(14, 2)), CAST(0.00 AS Decimal(14, 2)), CAST(13589.80 AS Decimal(14, 2)), CAST(0.00 AS Decimal(14, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(13589.80 AS Decimal(14, 2)), 0, 0, NULL, N'Neka adresa', NULL, 0, NULL, 2007, 1, CAST(0.0 AS Decimal(12, 2)), CAST(0.0 AS Decimal(12, 2)), 1, CAST(0.00 AS Decimal(5, 2)), CAST(0.00 AS Decimal(5, 2)), 0, 0, 4100010, 0.00)
INSERT [Calculation].[Bill] ([Id], [BillOrderId], [ContractId], [TariffGroupId], [DsoId], [CustomerId], [CustomerName], [MeteringPointId], [EIC], [MeteringPointName], [VatPayer], [AssociatedLegalEntities], [IsForLegalEntity], [TaxId], [VatNumber], [DateOfBill], [DateOfPayment], [SerialNumber], [NumberOfBillInYear], [RecapitulationReferenceNumber], [ReferenceNumber], [MeteringPointInDsoId], [DateOfPreviousReading], [DateOfReading], [Energy], [EnergyVat], [Netting], [NettingVat], [RenewableElectricity], [RenewableElectricityVat], [SupplyFee], [SupplyFeeVat], [CommonConsumption], [CommonConsumptionVat], [AmountWithoutVat], [Vat], [AmountWithVat], [Interest], [TotalBillAmount], [PreviousBalance], [PaymentsInPeriod], [CorrectionsInPeriod], [TotalForPayment], [OverdueNotification], [Recapitulation], [DeliveryPath], [DeliveryAddress], [EmailForDelivery], [EmailDelivery], [CommonConsumptionGroupId], [BillForPeriodId], [CalculationTypeId], [NonStandardService], [NonStandardServiceVat], [ForPrint], [PercentageHT], [PercentageLT], [ReactiveEnergyBillingExemption], [BillForCorrection], [OriginalCustomerId], [PreviousBalanceOtherBookingType]) VALUES (1987, 202007, 100063, 1, 1, 4100843, N'Mljekara Dwelt', 61100001, N'36Z03800001H    ', N'Mljekara Dwelt', 1, 0, 0, NULL, NULL, CAST(N'2019-10-31' AS Date), CAST(N'2019-11-25' AS Date), N'1988', 1987, NULL, N'1987', 3800001, CAST(N'2019-09-30' AS Date), CAST(N'2019-10-31' AS Date), CAST(7300.23 AS Decimal(12, 2)), CAST(1241.03 AS Decimal(12, 2)), CAST(8678.86 AS Decimal(12, 2)), CAST(1475.41 AS Decimal(12, 2)), CAST(861.99 AS Decimal(12, 2)), CAST(146.54 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)),CAST(0.00 AS Decimal(14, 2)), CAST(0.00 AS Decimal(14, 2)), CAST(16841.08 AS Decimal(14, 2)), CAST(2862.98 AS Decimal(12, 2)), CAST(19704.06 AS Decimal(14, 2)), CAST(31.73 AS Decimal(14, 2)), CAST(19735.79 AS Decimal(14, 2)), CAST(17627.96 AS Decimal(14, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(19735.79 AS Decimal(14, 2)), 0, 0, NULL, N'Neka adresa', NULL, 0, NULL, 2007, 1, CAST(0.0 AS Decimal(12, 2)), CAST(0.0 AS Decimal(12, 2)), 1, CAST(0.00 AS Decimal(5, 2)), CAST(0.00 AS Decimal(5, 2)), 0, 0, 4100843, 0.00)
INSERT [Calculation].[Bill] ([Id], [BillOrderId], [ContractId], [TariffGroupId], [DsoId], [CustomerId], [CustomerName], [MeteringPointId], [EIC], [MeteringPointName], [VatPayer], [AssociatedLegalEntities], [IsForLegalEntity], [TaxId], [VatNumber], [DateOfBill], [DateOfPayment], [SerialNumber], [NumberOfBillInYear], [RecapitulationReferenceNumber], [ReferenceNumber], [MeteringPointInDsoId], [DateOfPreviousReading], [DateOfReading], [Energy], [EnergyVat], [Netting], [NettingVat], [RenewableElectricity], [RenewableElectricityVat], [SupplyFee], [SupplyFeeVat], [CommonConsumption], [CommonConsumptionVat], [AmountWithoutVat], [Vat], [AmountWithVat], [Interest], [TotalBillAmount], [PreviousBalance], [PaymentsInPeriod], [CorrectionsInPeriod], [TotalForPayment], [OverdueNotification], [Recapitulation], [DeliveryPath], [DeliveryAddress], [EmailForDelivery], [EmailDelivery], [CommonConsumptionGroupId], [BillForPeriodId], [CalculationTypeId], [NonStandardService], [NonStandardServiceVat], [ForPrint], [PercentageHT], [PercentageLT], [ReactiveEnergyBillingExemption], [BillForCorrection], [OriginalCustomerId], [PreviousBalanceOtherBookingType]) VALUES (1988, 202007, 100064, 1, 1, 4100843, N'Mljekara Dwelt', 61100021, N'36Z1SB1200027N  ', N'Mljekara Dwelt', 1, 0, 0, NULL, NULL, CAST(N'2019-10-31' AS Date), CAST(N'2019-11-25' AS Date), N'1989', 1988, NULL, N'1988', 3800027, CAST(N'2019-09-30' AS Date), CAST(N'2019-10-31' AS Date), CAST(7045.65 AS Decimal(12, 2)), CAST(1197.76 AS Decimal(12, 2)), CAST(1536.26 AS Decimal(12, 2)), CAST(261.16 AS Decimal(12, 2)), CAST(807.45 AS Decimal(12, 2)), CAST(137.27 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)),CAST(0.00 AS Decimal(14, 2)), CAST(0.00 AS Decimal(14, 2)), CAST(9389.36 AS Decimal(14, 2)), CAST(1596.19 AS Decimal(12, 2)), CAST(10985.55 AS Decimal(14, 2)), CAST(21.84 AS Decimal(14, 2)), CAST(11007.39 AS Decimal(14, 2)), CAST(12132.22 AS Decimal(14, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(11007.39 AS Decimal(14, 2)), 0, 0, NULL, N'Neka adresa', NULL, 0, NULL, 2007, 1, CAST(0.0 AS Decimal(12, 2)), CAST(0.0 AS Decimal(12, 2)), 1, CAST(0.00 AS Decimal(5, 2)), CAST(0.00 AS Decimal(5, 2)), 0, 0, 4100843, 0.00)
INSERT [Calculation].[Bill] ([Id], [BillOrderId], [ContractId], [TariffGroupId], [DsoId], [CustomerId], [CustomerName], [MeteringPointId], [EIC], [MeteringPointName], [VatPayer], [AssociatedLegalEntities], [IsForLegalEntity], [TaxId], [VatNumber], [DateOfBill], [DateOfPayment], [SerialNumber], [NumberOfBillInYear], [RecapitulationReferenceNumber], [ReferenceNumber], [MeteringPointInDsoId], [DateOfPreviousReading], [DateOfReading], [Energy], [EnergyVat], [Netting], [NettingVat], [RenewableElectricity], [RenewableElectricityVat], [SupplyFee], [SupplyFeeVat], [CommonConsumption], [CommonConsumptionVat], [AmountWithoutVat], [Vat], [AmountWithVat], [Interest], [TotalBillAmount], [PreviousBalance], [PaymentsInPeriod], [CorrectionsInPeriod], [TotalForPayment], [OverdueNotification], [Recapitulation], [DeliveryPath], [DeliveryAddress], [EmailForDelivery], [EmailDelivery], [CommonConsumptionGroupId], [BillForPeriodId], [CalculationTypeId], [NonStandardService], [NonStandardServiceVat], [ForPrint], [PercentageHT], [PercentageLT], [ReactiveEnergyBillingExemption], [BillForCorrection], [OriginalCustomerId], [PreviousBalanceOtherBookingType]) VALUES (1989, 202007, 100065, 1, 1, 4100843, N'Mljekara Dwelt', 61100069, N'36Z0SB00        ', N'Mljekara Dwelt', 1, 0, 0, NULL, NULL, CAST(N'2019-10-31' AS Date), CAST(N'2019-11-25' AS Date), N'1990', 1989, NULL, N'1989', 3800084, CAST(N'2019-09-30' AS Date), CAST(N'2019-10-31' AS Date), CAST(2231.95 AS Decimal(12, 2)), CAST(379.43 AS Decimal(12, 2)), CAST(486.66 AS Decimal(12, 2)), CAST(82.73 AS Decimal(12, 2)), CAST(269.59 AS Decimal(12, 2)), CAST(45.83 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)),CAST(0.00 AS Decimal(14, 2)), CAST(0.00 AS Decimal(14, 2)), CAST(2988.20 AS Decimal(14, 2)), CAST(507.99 AS Decimal(12, 2)), CAST(3496.19 AS Decimal(14, 2)), CAST(2.95 AS Decimal(14, 2)), CAST(3499.14 AS Decimal(14, 2)), CAST(1637.70 AS Decimal(14, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)), CAST(3499.14 AS Decimal(14, 2)), 0, 0, NULL, N'Neka adresa', NULL, 0, NULL, 2007, 1, CAST(0.0 AS Decimal(12, 2)), CAST(0.0 AS Decimal(12, 2)), 1, CAST(0.00 AS Decimal(5, 2)), CAST(0.00 AS Decimal(5, 2)), 0, 0, 4100843, 0.00)


INSERT [Calculation].[BillItem] ([Id], [BillId], [TariffItemId], [Description], [MeasureUnit], [NewReading], [OldReading], [Spent], [Quantity], [VatRate], [EnergyPrice], [EnergyAmount], [NettingPrice], [NettingAmount], [ActiveConstant], [ReactiveConstant], [PowerConstant], [ActiveMeterNumber], [ReactiveMeterNumber], [IndirectConsumption], [LosesInTransformation], [Penalties], [AssignmentApproval], [EnergyPriceWithoutDiscount], [EnergyPriceDiscountPercentage], [NonStandardServicesPrice], [NonStandardServicesAmount],[SavingElectricityPercentage],DistributiveNettingAmount,TransferNettingPrice,TransferNettingAmount,DistributiveNettingPrice) VALUES (1, 1270, 1, N'Test 1', N'kWh', CAST(150.0000 AS Decimal(12, 4)), CAST(144.0000 AS Decimal(12, 4)), CAST(6.0000 AS Decimal(12, 4)), CAST(1.0000 AS Decimal(12, 4)), CAST(17 AS Decimal(4, 0)), CAST(23.000000 AS Decimal(12, 6)), CAST(34.0000 AS Decimal(12, 4)), CAST(12.000000 AS Decimal(12, 6)), CAST(123.0000 AS Decimal(12, 4)), CAST(13.0000 AS Decimal(12, 4)), CAST(123.0000 AS Decimal(12, 4)), CAST(13.0000 AS Decimal(12, 4)), N'1', N'1', CAST(1.0000 AS Decimal(12, 4)), CAST(1.0000 AS Decimal(12, 4)), CAST(1.0000 AS Decimal(12, 4)), CAST(1.0000 AS Decimal(12, 4)), CAST(0.000000 AS Decimal(12, 6)), 0, 0, 0,0,0,0,0,0)
INSERT [Calculation].[BillItem] ([Id], [BillId], [TariffItemId], [Description], [MeasureUnit], [NewReading], [OldReading], [Spent], [Quantity], [VatRate], [EnergyPrice], [EnergyAmount], [NettingPrice], [NettingAmount], [ActiveConstant], [ReactiveConstant], [PowerConstant], [ActiveMeterNumber], [ReactiveMeterNumber], [IndirectConsumption], [LosesInTransformation], [Penalties], [AssignmentApproval], [EnergyPriceWithoutDiscount], [EnergyPriceDiscountPercentage], [NonStandardServicesPrice], [NonStandardServicesAmount],[SavingElectricityPercentage],DistributiveNettingAmount,TransferNettingPrice,TransferNettingAmount,DistributiveNettingPrice) VALUES (2, 1270, 1, N'Test 1', N'kWh', CAST(150.0000 AS Decimal(12, 4)), CAST(144.0000 AS Decimal(12, 4)), CAST(6.0000 AS Decimal(12, 4)), CAST(1.0000 AS Decimal(12, 4)), CAST(17 AS Decimal(4, 0)), CAST(23.000000 AS Decimal(12, 6)), CAST(34.0000 AS Decimal(12, 4)), CAST(12.000000 AS Decimal(12, 6)), CAST(123.0000 AS Decimal(12, 4)), CAST(13.0000 AS Decimal(12, 4)), CAST(123.0000 AS Decimal(12, 4)), CAST(13.0000 AS Decimal(12, 4)), N'1', N'1', CAST(1.0000 AS Decimal(12, 4)), CAST(1.0000 AS Decimal(12, 4)), CAST(1.0000 AS Decimal(12, 4)), CAST(1.0000 AS Decimal(12, 4)), CAST(0.000000 AS Decimal(12, 6)), 0, 0, 0,0,0,0,0,0)
INSERT [Calculation].[BillItem] ([Id], [BillId], [TariffItemId], [Description], [MeasureUnit], [NewReading], [OldReading], [Spent], [Quantity], [VatRate], [EnergyPrice], [EnergyAmount], [NettingPrice], [NettingAmount], [ActiveConstant], [ReactiveConstant], [PowerConstant], [ActiveMeterNumber], [ReactiveMeterNumber], [IndirectConsumption], [LosesInTransformation], [Penalties], [AssignmentApproval], [EnergyPriceWithoutDiscount], [EnergyPriceDiscountPercentage], [NonStandardServicesPrice], [NonStandardServicesAmount],[SavingElectricityPercentage],DistributiveNettingAmount,TransferNettingPrice,TransferNettingAmount,DistributiveNettingPrice) VALUES (3, 1274, 1, N'Test 1', N'kWh', CAST(150.0000 AS Decimal(12, 4)), CAST(144.0000 AS Decimal(12, 4)), CAST(6.0000 AS Decimal(12, 4)), CAST(1.0000 AS Decimal(12, 4)), CAST(17 AS Decimal(4, 0)), CAST(23.000000 AS Decimal(12, 6)), CAST(34.0000 AS Decimal(12, 4)), CAST(12.000000 AS Decimal(12, 6)), CAST(123.0000 AS Decimal(12, 4)), CAST(13.0000 AS Decimal(12, 4)), CAST(123.0000 AS Decimal(12, 4)), CAST(13.0000 AS Decimal(12, 4)), N'1', N'1', CAST(1.0000 AS Decimal(12, 4)), CAST(1.0000 AS Decimal(12, 4)), CAST(1.0000 AS Decimal(12, 4)), CAST(1.0000 AS Decimal(12, 4)), CAST(0.000000 AS Decimal(12, 6)), 0, 0, 0,0,0,0,0,0)


SET IDENTITY_INSERT [Calculation].[BillCorrectionType] ON 

INSERT [Calculation].[BillCorrectionType] 
    ([Id], [Name], [CalculationTypeId]) 
VALUES 
    (1, N'Test', 1)

SET IDENTITY_INSERT [Calculation].[BillCorrectionType] OFF


INSERT [Calculation].[CalculationItem] 
    ([Id], [Name]) 
VALUES 
    (1, N'Reading'),
    (2, N'Losses'),
    (3, N'Indirect Consumption'),
    (4, N'Penalties'),
    (5, N'Supply Fee'),
    (7, N'Approved Reactive'),
    (9, N'Calculation')


SET IDENTITY_INSERT [Calculation].[EnergyCalculation] ON 

INSERT [Calculation].[EnergyCalculation] ([Id], [PeriodId], [DsoId], [DateOfExchange], [ReadingTypeId], [CalculationItemId], [CalculationItemName], [CustomerId], [CustomerName], [Eic], [MeteringPointId], [MeterNumber], [Constant], [NumberOfDaysCoefficient], [TariffItemId], [TariffItemName], [DateOfPreviousReading], [DateOfReading], [OldReading], [NewReading], [Spent], [ForBilling], [TariffItemUnitOfMeasure], [TariffGroupId], [Price], [Amount], [SnLosses], [PcuLosses], [PfeLosses], [TmjLosses], [UnLosses], [UkLosses], [ApprovedPower], [FePercentage], [CuPercentage],[MeteringPointTypeId]) VALUES (1, 1912, 1, CAST(N'2019-12-12T00:00:00.000' AS DateTime), 1, 1, N'1', 1100001, N'Customer 1', N'123             ', 1, N'1', CAST(1.00 AS Decimal(10, 2)), 1, 1, N'xxx', CAST(N'2019-11-12T00:00:00.000' AS DateTime), CAST(N'2019-12-12T00:00:00.000' AS DateTime), CAST(1.0000 AS Decimal(12, 4)), CAST(7.0000 AS Decimal(12, 4)), CAST(6.000000 AS Decimal(14, 6)), CAST(6.000000 AS Decimal(14, 6)), N'1', 1, CAST(56.000000 AS Decimal(12, 6)), CAST(65.000000 AS Decimal(14, 6)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.0000 AS Decimal(12, 4)), CAST(6.00 AS Decimal(3, 2)), CAST(1.00 AS Decimal(3, 2)),1)
INSERT [Calculation].[EnergyCalculation] ([Id], [PeriodId], [DsoId], [DateOfExchange], [ReadingTypeId], [CalculationItemId], [CalculationItemName], [CustomerId], [CustomerName], [Eic], [MeteringPointId], [MeterNumber], [Constant], [NumberOfDaysCoefficient], [TariffItemId], [TariffItemName], [DateOfPreviousReading], [DateOfReading], [OldReading], [NewReading], [Spent], [ForBilling], [TariffItemUnitOfMeasure], [TariffGroupId], [Price], [Amount], [SnLosses], [PcuLosses], [PfeLosses], [TmjLosses], [UnLosses], [UkLosses], [ApprovedPower], [FePercentage], [CuPercentage],[MeteringPointTypeId]) VALUES (2, 1912, 1, CAST(N'2019-12-12T00:00:00.000' AS DateTime), 1, 1, N'1', 1100001, N'Customer 1', N'123x            ', 1, N'1', CAST(2.00 AS Decimal(10, 2)), 1, 2, N'xxx', CAST(N'2019-11-12T00:00:00.000' AS DateTime), CAST(N'2019-12-12T00:00:00.000' AS DateTime), CAST(1.0000 AS Decimal(12, 4)), CAST(1.0000 AS Decimal(12, 4)), CAST(1.000000 AS Decimal(14, 6)), CAST(1.000000 AS Decimal(14, 6)), N'1', 1, CAST(11.000000 AS Decimal(12, 6)), CAST(78.000000 AS Decimal(14, 6)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(567.0000 AS Decimal(12, 4)), CAST(9.00 AS Decimal(3, 2)), CAST(1.00 AS Decimal(3, 2)),1)
INSERT [Calculation].[EnergyCalculation] ([Id], [PeriodId], [DsoId], [DateOfExchange], [ReadingTypeId], [CalculationItemId], [CalculationItemName], [CustomerId], [CustomerName], [Eic], [MeteringPointId], [MeterNumber], [Constant], [NumberOfDaysCoefficient], [TariffItemId], [TariffItemName], [DateOfPreviousReading], [DateOfReading], [OldReading], [NewReading], [Spent], [ForBilling], [TariffItemUnitOfMeasure], [TariffGroupId], [Price], [Amount], [SnLosses], [PcuLosses], [PfeLosses], [TmjLosses], [UnLosses], [UkLosses], [ApprovedPower], [FePercentage], [CuPercentage],[MeteringPointTypeId]) VALUES (3, 1912, 1, CAST(N'2019-12-12T00:00:00.000' AS DateTime), 1, 2, N'1', 1100001, N'Customer 1', N'123             ', 2, N'2', CAST(1.00 AS Decimal(10, 2)), 1, 3, N'xxx', CAST(N'2019-11-12T00:00:00.000' AS DateTime), CAST(N'2019-12-12T00:00:00.000' AS DateTime), CAST(1.0000 AS Decimal(12, 4)), CAST(55.0000 AS Decimal(12, 4)), CAST(54.000000 AS Decimal(14, 6)), CAST(54.000000 AS Decimal(14, 6)), N'1', 1, CAST(454.000000 AS Decimal(12, 6)), CAST(234.000000 AS Decimal(14, 6)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(134.0000 AS Decimal(12, 4)), CAST(3.00 AS Decimal(3, 2)), CAST(1.00 AS Decimal(3, 2)),1)
INSERT [Calculation].[EnergyCalculation] ([Id], [PeriodId], [DsoId], [DateOfExchange], [ReadingTypeId], [CalculationItemId], [CalculationItemName], [CustomerId], [CustomerName], [Eic], [MeteringPointId], [MeterNumber], [Constant], [NumberOfDaysCoefficient], [TariffItemId], [TariffItemName], [DateOfPreviousReading], [DateOfReading], [OldReading], [NewReading], [Spent], [ForBilling], [TariffItemUnitOfMeasure], [TariffGroupId], [Price], [Amount], [SnLosses], [PcuLosses], [PfeLosses], [TmjLosses], [UnLosses], [UkLosses], [ApprovedPower], [FePercentage], [CuPercentage],[MeteringPointTypeId]) VALUES (4, 1912, 1, CAST(N'2019-12-12T00:00:00.000' AS DateTime), 1, 1, N'1', 1100001, N'Customer 1', N'123             ', 1, N'1', CAST(3.00 AS Decimal(10, 2)), 1, 4, N'xxx', CAST(N'2019-11-12T00:00:00.000' AS DateTime), CAST(N'2019-12-12T00:00:00.000' AS DateTime), CAST(1.0000 AS Decimal(12, 4)), CAST(45.0000 AS Decimal(12, 4)), CAST(44.000000 AS Decimal(14, 6)), CAST(44.000000 AS Decimal(14, 6)), N'1', 1, CAST(4.000000 AS Decimal(12, 6)), CAST(55.000000 AS Decimal(14, 6)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(11.0000 AS Decimal(12, 4)), CAST(1.00 AS Decimal(3, 2)), CAST(1.00 AS Decimal(3, 2)),1)
INSERT [Calculation].[EnergyCalculation] ([Id], [PeriodId], [DsoId], [DateOfExchange], [ReadingTypeId], [CalculationItemId], [CalculationItemName], [CustomerId], [CustomerName], [Eic], [MeteringPointId], [MeterNumber], [Constant], [NumberOfDaysCoefficient], [TariffItemId], [TariffItemName], [DateOfPreviousReading], [DateOfReading], [OldReading], [NewReading], [Spent], [ForBilling], [TariffItemUnitOfMeasure], [TariffGroupId], [Price], [Amount], [SnLosses], [PcuLosses], [PfeLosses], [TmjLosses], [UnLosses], [UkLosses], [ApprovedPower], [FePercentage], [CuPercentage],[MeteringPointTypeId]) VALUES (5, 1912, 1, CAST(N'2019-12-12T00:00:00.000' AS DateTime), 1, 2, N'1', 1100001, N'Customer 1', N'123             ', 1, N'1', CAST(1.00 AS Decimal(10, 2)), 1, 1, N'xxx', CAST(N'2019-11-12T00:00:00.000' AS DateTime), CAST(N'2019-12-12T00:00:00.000' AS DateTime), CAST(1.0000 AS Decimal(12, 4)), CAST(1.0000 AS Decimal(12, 4)), CAST(1.000000 AS Decimal(14, 6)), CAST(1.000000 AS Decimal(14, 6)), N'1', 1, CAST(1.000000 AS Decimal(12, 6)), CAST(11.000000 AS Decimal(14, 6)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.0000 AS Decimal(12, 4)), CAST(1.00 AS Decimal(3, 2)), CAST(1.00 AS Decimal(3, 2)),1)
INSERT [Calculation].[EnergyCalculation] ([Id], [PeriodId], [DsoId], [DateOfExchange], [ReadingTypeId], [CalculationItemId], [CalculationItemName], [CustomerId], [CustomerName], [Eic], [MeteringPointId], [MeterNumber], [Constant], [NumberOfDaysCoefficient], [TariffItemId], [TariffItemName], [DateOfPreviousReading], [DateOfReading], [OldReading], [NewReading], [Spent], [ForBilling], [TariffItemUnitOfMeasure], [TariffGroupId], [Price], [Amount], [SnLosses], [PcuLosses], [PfeLosses], [TmjLosses], [UnLosses], [UkLosses], [ApprovedPower], [FePercentage], [CuPercentage],[MeteringPointTypeId]) VALUES (6, 1912, 1, CAST(N'2019-12-12T00:00:00.000' AS DateTime), 1, 7, N'1', 1100001, N'Customer 1', N'123             ', 1, N'1', CAST(1.00 AS Decimal(10, 2)), 1, 2, N'xxx', CAST(N'2019-11-12T00:00:00.000' AS DateTime), CAST(N'2019-12-12T00:00:00.000' AS DateTime), CAST(1.0000 AS Decimal(12, 4)), CAST(1.0000 AS Decimal(12, 4)), CAST(1.000000 AS Decimal(14, 6)), CAST(1.000000 AS Decimal(14, 6)), N'1', 1, CAST(23.000000 AS Decimal(12, 6)), CAST(5.000000 AS Decimal(14, 6)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(67.0000 AS Decimal(12, 4)), CAST(1.00 AS Decimal(3, 2)), CAST(1.00 AS Decimal(3, 2)),1)
INSERT [Calculation].[EnergyCalculation] ([Id], [PeriodId], [DsoId], [DateOfExchange], [ReadingTypeId], [CalculationItemId], [CalculationItemName], [CustomerId], [CustomerName], [Eic], [MeteringPointId], [MeterNumber], [Constant], [NumberOfDaysCoefficient], [TariffItemId], [TariffItemName], [DateOfPreviousReading], [DateOfReading], [OldReading], [NewReading], [Spent], [ForBilling], [TariffItemUnitOfMeasure], [TariffGroupId], [Price], [Amount], [SnLosses], [PcuLosses], [PfeLosses], [TmjLosses], [UnLosses], [UkLosses], [ApprovedPower], [FePercentage], [CuPercentage],[MeteringPointTypeId]) VALUES (7, 1912, 1, CAST(N'2019-12-12T00:00:00.000' AS DateTime), 1, 9, N'1', 1100001, N'Customer 1', N'123             ', 1, N'1', CAST(6.00 AS Decimal(10, 2)), 1, 3, N'xxx', CAST(N'2019-11-12T00:00:00.000' AS DateTime), CAST(N'2019-12-12T00:00:00.000' AS DateTime), CAST(1.0000 AS Decimal(12, 4)), CAST(1.0000 AS Decimal(12, 4)), CAST(-8900.000000 AS Decimal(14, 6)), CAST(1.000000 AS Decimal(14, 6)), N'1', 1, CAST(689.000000 AS Decimal(12, 6)), CAST(-987.000000 AS Decimal(14, 6)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.00 AS Decimal(10, 2)), CAST(1.0000 AS Decimal(12, 4)), CAST(5.00 AS Decimal(3, 2)), CAST(1.00 AS Decimal(3, 2)),1)

SET IDENTITY_INSERT [Calculation].[EnergyCalculation] OFF


INSERT [Customer].[ContractType] 
    ([Id], [Name], [IsDefaultType], [PrintName]) 
VALUES 
    (1, N'Tip 1', 1, N'Tip 1'),
    (2, N'Tip 2', 0, N'Tip 2'),
    (3, N'Tip 3', 0, N'Tip 3')

SET IDENTITY_INSERT [Customer].[Contract] ON 

INSERT [Customer].[Contract] 
    ([Id], [DsoId], [CustomerId], [MeteringPointId], [ActiveMeterNumber], [ReactiveMeterNumber], [MeteringPointName], [MeteringPointPrintName], [MeteringPointInDsoId], [TariffGroupId], [PriceCategoryId], [PriceCategoryForNettingId], [Signed], [StartDate], [EndDate], [ValidityDateFrom], [ValidityDateTo], [SignatureDate], [ContractNumber], [PostOfficeDeliveryId], [PlaceDeliveryId], [StreetDeliveryId], [ActivityId], [StreetDeliveryNumber], [AddressTextDelivery], [EmailDelivery], [EmailForDelivery], [ActiveConstant], [ReactiveConstant], [PowerConstant], [VatReductionPercentage], [ContactPersonName], [ContactPersonPhone], [ContactPersonEmail], [OperationalAreaId], [Recapitulation], [ContractTypeId], [DeliveryPath], [ContractRequestId], [CommonContract], [ConsolidatedBill], [CalculationExemption], [ReactiveEnergyBillingExemption], [MeteringPointTypeId]) 
VALUES 
    (100063, 1, 4100843, 61100001, N'1233', '1233', N'Mjerno mjesto 1', N'Mjerno mjesto 1', 3800001,  1, 1, 20, 1, CAST(N'2020-01-01' AS Date), NULL, CAST(N'2020-01-01' AS Date), CAST(N'2020-12-31' AS Date), CAST(N'2020-01-01' AS Date), N'1.1/01-1111-61/19', 71000, 1, 3, 1,    N'1',  N'Nepoznata ulica 1, 71000 ',  0, N'', CAST(200.00 AS Decimal(10, 2)),   CAST(200.00 AS Decimal(10, 2)),   CAST(200.00 AS Decimal(10, 2)),   CAST(0.00 AS Decimal(5, 2)), NULL, NULL, NULL, 3,    0, 1, NULL, NULL, 0, 0, 0, 0, 1),
    (100064, 1, 4100843, 61100021, N'2515', '2515', N'Mjerno mjesto 1', N'Mjerno mjesto 1', 3800027,  1, 1, 20, 1, CAST(N'2020-01-01' AS Date), NULL, CAST(N'2020-01-01' AS Date), CAST(N'2020-12-31' AS Date), CAST(N'2020-01-01' AS Date), N'1.1/01-1111-61/19', 71000, 1, 3, 1,    N'1',  N'Nepoznata ulica 1, 71000 ',  0, N'', CAST(200.00 AS Decimal(10, 2)),   CAST(200.00 AS Decimal(10, 2)),   CAST(200.00 AS Decimal(10, 2)),   CAST(0.00 AS Decimal(5, 2)), NULL, NULL, NULL, 3,    0, 1, NULL, NULL, 0, 0, 0, 0, 1),
    (100065, 1, 4100843, 61100069, N'4651', '4651', N'Mjerno mjesto 1', N'Mjerno mjesto 1', 3800084,  1, 1, 20, 1, CAST(N'2020-01-01' AS Date), NULL, CAST(N'2020-01-01' AS Date), CAST(N'2020-12-31' AS Date), CAST(N'2020-01-01' AS Date), N'1.1/01-1111-61/19', 71000, 1, 3, 1,    N'1',  N'Nepoznata ulica 1, 71000 ',  0, N'', CAST(200.00 AS Decimal(10, 2)),   CAST(200.00 AS Decimal(10, 2)),   CAST(200.00 AS Decimal(10, 2)),   CAST(0.00 AS Decimal(5, 2)), NULL, NULL, NULL, 3,    0, 1, NULL, NULL, 0, 0, 0, 0, 1),
    (200008, 1, 2100267, 62100355, N'1122', '1122', N'Mjerno mjesto 1', N'Mjerno mjesto 1', 31033756, 1, 1, 20, 1, CAST(N'2020-01-01' AS Date), NULL, CAST(N'2020-01-01' AS Date), CAST(N'2020-12-31' AS Date), CAST(N'2020-01-01' AS Date), N'1.1/01-1111-61/19', 71000, 1, 3, 1,    N'8',  N'Nepoznata ulica 8, 71000 ',  0, N'', CAST(22000.00 AS Decimal(10, 2)), CAST(22000.00 AS Decimal(10, 2)), CAST(22000.00 AS Decimal(10, 2)), CAST(0.00 AS Decimal(5, 2)), NULL, NULL, NULL, 3,    0, 1, NULL, NULL, 0, 0, 0, 0, 1),
    (600001, 2, 4100010, 66100001, N'5841', '5841', N'Mjerno mjesto 2', N'Mjerno mjesto 2', 66100001, 1, 1, 20, 1, CAST(N'2020-01-01' AS Date), NULL, CAST(N'2020-01-01' AS Date), CAST(N'2020-12-31' AS Date), CAST(N'2020-01-01' AS Date), N'1.1/01-1111-61/19', 71000, 1, 3, 1,    N'1',  N'Nepoznata ulica 1, 71000 ',  0, N'', CAST(16500.00 AS Decimal(10, 2)), CAST(16500.00 AS Decimal(10, 2)), CAST(16500.00 AS Decimal(10, 2)), CAST(0.00 AS Decimal(5, 2)), NULL, NULL, NULL, 3,    1, 1, NULL, NULL, 0, 0, 0, 0, 1),
    (600002, 3, 4100010, 66100002, N'5615', '5615', N'Mjerno mjesto 3', N'Mjerno mjesto 3', 66100002, 1, 1, 20, 1, CAST(N'2020-01-01' AS Date), NULL, CAST(N'2020-01-01' AS Date), CAST(N'2020-12-31' AS Date), CAST(N'2020-01-01' AS Date), N'1.1/01-1111-61/19', 71000, 1, 4, 1,    N'A5', N'Kulina bana A5, 71000 ',     0, N'', CAST(16500.00 AS Decimal(10, 2)), CAST(16500.00 AS Decimal(10, 2)), CAST(16500.00 AS Decimal(10, 2)), CAST(0.00 AS Decimal(5, 2)), NULL, NULL, NULL, 4,    0, 1, NULL, NULL, 0, 0, 0, 0, 1),
    (600003, 4, 4100010, 66100003, N'2236', '2236', N'Mjerno mjesto 4', N'Mjerno mjesto 4', 66100003, 1, 1, 20, 1, CAST(N'2020-01-01' AS Date), NULL, CAST(N'2020-01-01' AS Date), CAST(N'2020-12-31' AS Date), CAST(N'2020-01-01' AS Date), N'1.1/01-1111-61/19', 71000, 1, 3, 1,    N'NN', N'Nepoznata ulica NN, 71000 ', 0, N'', CAST(16500.00 AS Decimal(10, 2)), CAST(16500.00 AS Decimal(10, 2)), CAST(16500.00 AS Decimal(10, 2)), CAST(0.00 AS Decimal(5, 2)), NULL, NULL, NULL, 4,    0, 1, NULL, NULL, 0, 0, 0, 0, 1),
    (600004, 5, 4100010, 66100004, N'3036', '3036', N'Mjerno mjesto 5', N'Mjerno mjesto 5', 66100004, 1, 1, 20, 1, CAST(N'2020-01-01' AS Date), NULL, CAST(N'2020-01-01' AS Date), CAST(N'2020-12-31' AS Date), CAST(N'2020-01-01' AS Date), N'1.1/01-1111-61/19', 71000, 1, 2, 1,    N'1',  N' 1, 71000 ',                 0, N'', CAST(16500.00 AS Decimal(10, 2)), CAST(16500.00 AS Decimal(10, 2)), CAST(16500.00 AS Decimal(10, 2)), CAST(0.00 AS Decimal(5, 2)), NULL, NULL, NULL, 3,    1, 1, NULL, NULL, 0, 0, 0, 0, 1),
    (600005, 6, 4100010, 66100005, N'1206', '1206', N'Mjerno mjesto 6', N'Mjerno mjesto 6', 66100005, 1, 1, 20, 1, CAST(N'2020-01-01' AS Date), NULL, CAST(N'2020-01-01' AS Date), CAST(N'2020-12-31' AS Date), CAST(N'2020-01-01' AS Date), N'1.1/01-1111-61/19', 71000, 1, 5, 1,    N'36', N'Trebevicka 36, 71000 ',      0, N'', CAST(16500.00 AS Decimal(10, 2)), CAST(16500.00 AS Decimal(10, 2)), CAST(16500.00 AS Decimal(10, 2)), CAST(0.00 AS Decimal(5, 2)), NULL, NULL, NULL, NULL, 0, 1, NULL, NULL, 0, 0, 0, 0, 1),
    (600007, 1, 4100010, 66100007, N'5252', '5252', N'Mjerno mjesto 1', N'Mjerno mjesto 1', 66100007, 1, 1, 20, 1, CAST(N'2020-01-01' AS Date), NULL, CAST(N'2020-01-01' AS Date), CAST(N'2020-12-31' AS Date), CAST(N'2020-01-01' AS Date), N'1.1/01-1111-61/19', 71000, 1, 3, NULL, N'1',  N'Nepoznata ulica 1, 71000 ',  0, N'', CAST(16500.00 AS Decimal(10, 2)), CAST(16500.00 AS Decimal(10, 2)), CAST(16500.00 AS Decimal(10, 2)), CAST(0.00 AS Decimal(5, 2)), NULL, NULL, NULL, NULL, 0, 1, NULL, NULL, 0, 0, 0, 0, 1)

SET IDENTITY_INSERT [Customer].[Contract] OFF


SET IDENTITY_INSERT [Customer].[Customer] ON 

INSERT [Customer].[Customer] 
    ([Id], [IsLegalEntity], [Name], [PrintName], [AdditionalName], [VatPayer], [TaxId], [VatNumber], [AssociatedLegalEntities], [CompetentDsoId], [PlaceId], [PostOfficeId], [StreetId], [AddressText], [StreetNumber], [PhoneNumber], [MobilePhoneNumber], [Fax], [Email], [Www], [PreferredCommunicationChanel], [AuthorizedPersonFirstName], [AuthorizedPersonLastName], [AuthorizedPersonWorkPlace], [AuthorizedPersonPlaceOfWork], [AuthorizedPersonPhone], [AuthorizedPersonEmail], [SapCode], [TestBills], [AdvancePaymentTransferNotPreferred], [LastChangedByUserId], [LastChangeDate], [IsPortalUser], [IsBudgetUser], [IsBankruptcy]) 
VALUES 
    (0,       0, N'Nepoznat kupac',                        N'Nepoznat kupac',                        NULL,                                     0, NULL,             NULL,            0, NULL, 1, 78000, 1, N' NN, 78000 ', N'NN', NULL, NULL,             NULL, N'',  NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL,      0, 0, 3 ,'2000-01-01 00:00:00.000', 0, 0, 0),
    (1100001, 1, N'Zanatska radionica 6',                  N'Zanatska radionica 6',                  NULL,                                     0, N'2515141526314', N'            ', 0, 5,    1, 78000, 2, N' 1,  75324 ', N'1',  NULL, N'',              N'',  N'',  N'',  NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL,      0, 0, 3 ,'2000-01-01 00:00:00.000', 0, 0, 0),
    (1100016, 1, N'Korporacija 5',                         N'Korporacija 5',                         N'Korporacija 5',                         1, N'2514561415154', N'251456141515', 0, 5,    1, 78000, 1, N' 12, 75413 ', N'12', N'',  NULL,             NULL, N'',  NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL,      0, 0, 3 ,'2000-01-01 00:00:00.000', 0, 0, 0),
    (1100083, 1, N'Samostalna radnja 4',                   N'Samostalna radnja 4',                   N'Samostalna radnja 4',                   0, N'5251561615499', N'            ', 0, 3,    1, 78000, 2, N' 4,  76300 ', N'4',  N'',  NULL,             NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL,      0, 0, 3 ,'2000-01-01 00:00:00.000', 0, 0, 0),
    (1200001, 0, N'Fizicko lice 1',                        N'Fizicko lice 1',                        N'Fizicko lice 1',                        0, NULL,             NULL,            0, 2,    1, 78000, 1, N' 1,  70101 ', N'1',  NULL, N'06x xxx xxx x', NULL, N'',  N'',  NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL,      0, 0, 3 ,'2000-01-01 00:00:00.000', 0, 0, 0),
    (2100267, 1, N'Drustvo sa ogranicenom odgovornoscu 3', N'Drustvo sa ogranicenom odgovornoscu 3', N'Drustvo sa ogranicenom odgovornoscu 3', 1, N'1146541514141', N'146541514141', 0, 5,    1, 78000, 1, N' 4,  74101 ', N'4',  N'',  NULL,             NULL, N'',  NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL,      0, 0, 3 ,'2000-01-01 00:00:00.000', 0, 0, 0),
    (4100010, 1, N'Firma 2',                               N'Firma 2',                               N'Firma 2',                               1, N'1141651716518', N'141651716518', 1, 2,    1, 78000, 1, N' 1,  74101 ', N'1',  N'',  NULL,             NULL, N'',  NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, N'152AD2', 0, 0, 3 ,'2000-01-01 00:00:00.000', 0, 0, 0),
    (4100843, 1, N'Preduzece 1',                           N'Preduzece 1',                           N'Preduzece 1',                           1, N'1211452146596', N'121145214659', 0, 1,    1, 78000, 2, N' 5,  79101 ', N'5',  N'',  NULL,             NULL, N'',  NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL,      0, 0, 3 ,'2000-01-01 00:00:00.000', 0, 0, 0)

SET IDENTITY_INSERT [Customer].[Customer] OFF


INSERT [Customer].[ComplaintType] 
    ([Id], [Name]) 
VALUES 
    (1, N'Prigovor')


SET IDENTITY_INSERT [Customer].[RequestType] ON 

INSERT [Customer].[RequestType] 
    ([Id], [Description], [ComplaintTypeId], [Code]) 
VALUES 
    (1, N'Vrsta zahtjeva 1', 1, 'P-1'),
    (2, N'Vrsta zahtjeva 2', 1, 'P-2')

SET IDENTITY_INSERT [Customer].[RequestType] OFF


INSERT INTO [Finance].[BookingType]
	([Id], [Name], [PrintName], [IsInterestCalculated], [CanDebtRestructure], [CanTransferApprovalTo], [CanTransferApprovalFrom],[CanCreateOverdueNotice])
 VALUES
     (1,  N'Redovna potrošnja', N'Редовна потрошња', 1, 1, 0, 0,0)
    ,(2,  N'Reprogram', N'Репрограми', 0, 0, 0, 0,0)
    ,(3,  N'Pravni odnosi', N'Пресуђена потраживања', 1, 0, 0, 0,0)
    ,(4,  N'Nestandardne usluge', N'Нестандардне услуге', 1, 0, 0, 0,0)
    ,(5,  N'Potraživanja u stečajnom postupku', N'Потраживања у стечајном поступку', 1, 0, 0, 0,0)
    ,(6,  N'Neraspoređene uplate', N'Нераспоређене уплате', 0, 0, 0, 0,0)
    ,(7,  N'Medijacije', N'Медијације', 1, 0, 0, 0,0)
    ,(8,  N'Tužbe u pripremi', N'Тужбе у припреми', 0, 0, 0, 0,0)
    ,(9,  N'Utužena potraživanja', N'Утужена потраживања', 0, 0, 0, 0,0)
    ,(10, N'Potraživanja u izvršnom postupku', N'Потраживања у извршном поступку', 1, 0, 0, 0,0)
    ,(11, N'Troškova sudskih postupaka', N'Трошкови судских поступака', 1, 0, 0, 0,0)


INSERT [Finance].[AccountingType] 
    ([Id], [Name], [PrintName]) 
VALUES 
    (1, N'Racun',     N'Racun'),
    (2, N'Uplata',    N'Uplata'),
    (3, N'Korekcija', N'Korekcija')


SET IDENTITY_INSERT [Finance].[Bank] ON 

INSERT [Finance].[Bank] 
    ([Id], [Name], [LeadingAccountNumbers], [PrintName]) 
VALUES 
    (166, N'Banka 1', '552', N'Banka 1'),
    (167, N'Banka 2', '532', N'Banka 2')

SET IDENTITY_INSERT [Finance].[Bank] OFF


SET IDENTITY_INSERT [Finance].[BankAccount] ON 

INSERT [Finance].[BankAccount] 
    ([Id], [BankId], [Number], [BankSenderEmail], [AdapterName], [Active]) 
VALUES 
    (117, 166, N'552-123-12345678-14', NULL, NULL, 1)

SET IDENTITY_INSERT [Finance].[BankAccount] OFF


SET IDENTITY_INSERT [Finance].[Credit] ON 

INSERT [Finance].[Credit] ([Id], [BookingTypeId], [AccountingTypeId], [FinancialTypeId], [CustomerId], [MeteringPointId], [ContractId], [BillId], [PaymentId], [BillCorrectionId], [InterestCorrectionId], [DebtRestructureId], [AccusationId], [BankruptcyId], [MediationId], [DebtAcquittanceId], [PeriodId], [Date], [EntryDate], [DueDate], [Amount], [AmountLeft], [Description], [Note], [ReferenceNumber], [ContractTypeId]) VALUES (2, 1, 2, 8, 4100010, 66100003, NULL, NULL, 71, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 2010, CAST(N'2020-10-15' AS Date), CAST(N'2020-10-15T15:41:59.750' AS DateTime), CAST(N'2020-10-15' AS Date), CAST(5.00 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)), N'Uplata', NULL, N'1276', 1)
INSERT [Finance].[Credit] ([Id], [BookingTypeId], [AccountingTypeId], [FinancialTypeId], [CustomerId], [MeteringPointId], [ContractId], [BillId], [PaymentId], [BillCorrectionId], [InterestCorrectionId], [DebtRestructureId], [AccusationId], [BankruptcyId], [MediationId], [DebtAcquittanceId], [PeriodId], [Date], [EntryDate], [DueDate], [Amount], [AmountLeft], [Description], [Note], [ReferenceNumber], [ContractTypeId]) VALUES (4, 1, 2, 8, 4100010, 66100001, NULL, NULL, 72, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 2010, CAST(N'2020-10-15' AS Date), CAST(N'2020-10-15T15:41:59.750' AS DateTime), CAST(N'2020-10-15' AS Date), CAST(20.00 AS Decimal(12, 2)), CAST(0.00 AS Decimal(12, 2)), N'Uplata', NULL, NULL, 1)

SET IDENTITY_INSERT [Finance].[Credit] OFF


SET IDENTITY_INSERT [Finance].[Debit] ON 

INSERT [Finance].[Debit] ([Id], [BookingTypeId], [AccountingTypeId], [FinancialTypeId], [CustomerId], [MeteringPointId], [ContractId], [BillId], [PaymentId], [BillCorrectionId], [InterestCorrectionId], [DebtRestructureId], [AccusationId], [BankruptcyId], [MediationId], [DebtAcquittanceId], [PeriodId], [Date], [EntryDate], [DueDate], [Amount], [AmountLeft], [Description], [Note], [ReferenceNumber], [ContractTypeId]) VALUES (133, 1, 1, 1, 2100267, 62100355, 200008, 1270, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1910, CAST(N'2019-10-31' AS Date), CAST(N'2019-12-19T10:10:46.653' AS DateTime), CAST(N'2019-11-25' AS Date), CAST(10716.52 AS Decimal(12, 2)), CAST(10716.52 AS Decimal(12, 2)), N'Energija', NULL, N'1270', 1)
INSERT [Finance].[Debit] ([Id], [BookingTypeId], [AccountingTypeId], [FinancialTypeId], [CustomerId], [MeteringPointId], [ContractId], [BillId], [PaymentId], [BillCorrectionId], [InterestCorrectionId], [DebtRestructureId], [AccusationId], [BankruptcyId], [MediationId], [DebtAcquittanceId], [PeriodId], [Date], [EntryDate], [DueDate], [Amount], [AmountLeft], [Description], [Note], [ReferenceNumber], [ContractTypeId]) VALUES (135, 1, 1, 6, 4100010, 66100003, 600003, 1276, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1910, CAST(N'2019-10-31' AS Date), CAST(N'2019-12-19T10:10:46.793' AS DateTime), CAST(N'2019-11-25' AS Date), CAST(44.73 AS Decimal(12, 2)), CAST(24.73 AS Decimal(12, 2)), N'Pdv na mrežarinu', NULL, N'1276', 1)
INSERT [Finance].[Debit] ([Id], [BookingTypeId], [AccountingTypeId], [FinancialTypeId], [CustomerId], [MeteringPointId], [ContractId], [BillId], [PaymentId], [BillCorrectionId], [InterestCorrectionId], [DebtRestructureId], [AccusationId], [BankruptcyId], [MediationId], [DebtAcquittanceId], [PeriodId], [Date], [EntryDate], [DueDate], [Amount], [AmountLeft], [Description], [Note], [ReferenceNumber], [ContractTypeId]) VALUES (137, 1, 1, 6, 4100010, 66100004, 600004, 1277, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1910, CAST(N'2019-10-31' AS Date), CAST(N'2019-12-19T10:10:46.793' AS DateTime), CAST(N'2019-11-25' AS Date), CAST(1053.78 AS Decimal(12, 2)), CAST(1033.78 AS Decimal(12, 2)), N'Pdv na mrežarinu', NULL, N'1277', 1)
INSERT [Finance].[Debit] ([Id], [BookingTypeId], [AccountingTypeId], [FinancialTypeId], [CustomerId], [MeteringPointId], [ContractId], [BillId], [PaymentId], [BillCorrectionId], [InterestCorrectionId], [DebtRestructureId], [AccusationId], [BankruptcyId], [MediationId], [DebtAcquittanceId], [PeriodId], [Date], [EntryDate], [DueDate], [Amount], [AmountLeft], [Description], [Note], [ReferenceNumber], [ContractTypeId]) VALUES (139, 1, 1, 6, 4100010, 66100005, 600005, 1278, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1910, CAST(N'2019-10-31' AS Date), CAST(N'2019-12-19T10:10:46.793' AS DateTime), CAST(N'2019-11-25' AS Date), CAST(1237.16 AS Decimal(12, 2)), CAST(1237.16 AS Decimal(12, 2)), N'Pdv na mrežarinu', NULL, N'1278', 1)
INSERT [Finance].[Debit] ([Id], [BookingTypeId], [AccountingTypeId], [FinancialTypeId], [CustomerId], [MeteringPointId], [ContractId], [BillId], [PaymentId], [BillCorrectionId], [InterestCorrectionId], [DebtRestructureId], [AccusationId], [BankruptcyId], [MediationId], [DebtAcquittanceId], [PeriodId], [Date], [EntryDate], [DueDate], [Amount], [AmountLeft], [Description], [Note], [ReferenceNumber], [ContractTypeId]) VALUES (141, 1, 1, 6, 4100010, 66100007, 600007, 1280, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1910, CAST(N'2019-10-31' AS Date), CAST(N'2019-12-19T10:10:46.793' AS DateTime), CAST(N'2019-11-25' AS Date), CAST(272.66 AS Decimal(12, 2)), CAST(242.66 AS Decimal(12, 2)), N'Pdv na mrežarinu', NULL, N'1280', 1)
INSERT [Finance].[Debit] ([Id], [BookingTypeId], [AccountingTypeId], [FinancialTypeId], [CustomerId], [MeteringPointId], [ContractId], [BillId], [PaymentId], [BillCorrectionId], [InterestCorrectionId], [DebtRestructureId], [AccusationId], [BankruptcyId], [MediationId], [DebtAcquittanceId], [PeriodId], [Date], [EntryDate], [DueDate], [Amount], [AmountLeft], [Description], [Note], [ReferenceNumber], [ContractTypeId]) VALUES (143, 1, 1, 6, 4100843, 61100001, 100063, 1987, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1910, CAST(N'2019-10-31' AS Date), CAST(N'2019-12-19T10:10:46.793' AS DateTime), CAST(N'2019-11-25' AS Date), CAST(1475.41 AS Decimal(12, 2)), CAST(1475.41 AS Decimal(12, 2)), N'Pdv na mrežarinu', NULL, N'1987', 1)
INSERT [Finance].[Debit] ([Id], [BookingTypeId], [AccountingTypeId], [FinancialTypeId], [CustomerId], [MeteringPointId], [ContractId], [BillId], [PaymentId], [BillCorrectionId], [InterestCorrectionId], [DebtRestructureId], [AccusationId], [BankruptcyId], [MediationId], [DebtAcquittanceId], [PeriodId], [Date], [EntryDate], [DueDate], [Amount], [AmountLeft], [Description], [Note], [ReferenceNumber], [ContractTypeId]) VALUES (145, 1, 1, 6, 4100843, 61100021, 100064, 1988, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1910, CAST(N'2019-10-31' AS Date), CAST(N'2019-12-19T10:10:46.793' AS DateTime), CAST(N'2019-11-25' AS Date), CAST(261.16 AS Decimal(12, 2)), CAST(261.16 AS Decimal(12, 2)), N'Pdv na mrežarinu', NULL, N'1988', 1)
INSERT [Finance].[Debit] ([Id], [BookingTypeId], [AccountingTypeId], [FinancialTypeId], [CustomerId], [MeteringPointId], [ContractId], [BillId], [PaymentId], [BillCorrectionId], [InterestCorrectionId], [DebtRestructureId], [AccusationId], [BankruptcyId], [MediationId], [DebtAcquittanceId], [PeriodId], [Date], [EntryDate], [DueDate], [Amount], [AmountLeft], [Description], [Note], [ReferenceNumber], [ContractTypeId]) VALUES (147, 1, 1, 6, 4100843, 61100069, 100065, 1989, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 1910, CAST(N'2019-10-31' AS Date), CAST(N'2019-12-19T10:10:46.793' AS DateTime), CAST(N'2019-11-25' AS Date), CAST(82.73 AS Decimal(12, 2)), CAST(82.73 AS Decimal(12, 2)), N'Pdv na mrežarinu', NULL, N'1989', 1)

SET IDENTITY_INSERT [Finance].[Debit] OFF


INSERT [Finance].[FinancialType] 
    ([Id], [Name], [AccountingSequence], [IsInterestCalculated], [PrintName]) 
VALUES 
    (1, N'Energija',         7, 1, N'Energija'),
    (2, N'Mrežarina',        5, 1, N'Mrežarina'),
    (3, N'Naknada za OIEE',  6, 1, N'Naknada za OIEE'),
    (4, N'Kamata',           1, 1, N'Kamata'),
    (5, N'PDV na energiju',  4, 1, N'PDV na energiju'),
    (6, N'PDV na mrežarinu', 2, 1, N'PDV na mrežarinu'),
    (7, N'PDV na OIEE',      3, 1, N'PDV na OIEE'),
    (8, N'Uplata',           8, 1, N'Uplata')


SET IDENTITY_INSERT [Finance].[Interest] ON 

INSERT [Finance].[Interest] ([Id], [PeriodId], [DebitId], [BookingTypeId], [BillId], [DebtRestructureId], [AccusationId], [BankruptcyId], [MediationId], [RetroactiveCalculation], [CustomerId], [MeteringPointId], [DateFrom], [DateTo], [NumberOfDays], [PrincipalAmount], [Rate], [Amount], [CalculationDate]) VALUES (3, 2004, 135, 1, 1276, NULL, NULL, NULL, NULL, 0, 4100010, 66100003, CAST(N'2020-04-01' AS Date), CAST(N'2020-04-30' AS Date), 29, CAST(29.73 AS Decimal(12, 2)), CAST(0.02 AS Decimal(5, 2)), CAST(0.17243400 AS Decimal(14, 8)), CAST(N'2020-01-27T22:35:31.320' AS DateTime))
INSERT [Finance].[Interest] ([Id], [PeriodId], [DebitId], [BookingTypeId], [BillId], [DebtRestructureId], [AccusationId], [BankruptcyId], [MediationId], [RetroactiveCalculation], [CustomerId], [MeteringPointId], [DateFrom], [DateTo], [NumberOfDays], [PrincipalAmount], [Rate], [Amount], [CalculationDate]) VALUES (4, 2004, 141, 1, 1280, NULL, NULL, NULL, NULL, 0, 4100010, 66100007, CAST(N'2020-04-01' AS Date), CAST(N'2020-04-30' AS Date), 29, CAST(242.66 AS Decimal(12, 2)), CAST(0.02 AS Decimal(5, 2)), CAST(1.40742800 AS Decimal(14, 8)), CAST(N'2020-01-27T22:35:31.320' AS DateTime))

SET IDENTITY_INSERT [Finance].[Interest] OFF


SET IDENTITY_INSERT [Finance].[Payment] ON 

INSERT [Finance].[Payment] 
    ([Id], [PaymentJournalId], [CustomerId], [MeteringPointId], [BookingTypeId], [ReferenceNumber], [Amount], [Payer], [Note], [OrderNumber], [EntryDateTime], [UserId], [Archived], [ContractTypeId]) 
VALUES 
    (71, 46, 4100010, 66100003, 1, N'1276', CAST(5.00 AS Decimal(12, 2)), NULL, NULL, 1, CAST(N'2020-10-15T15:41:39.800' AS DateTime), 3, 0, 1),
    (72, 46, 4100010, 66100001, 1, NULL,   CAST(20.00 AS Decimal(12, 2)), NULL, NULL, 2, CAST(N'2020-10-15T15:41:54.740' AS DateTime), 3, 0, 1)

SET IDENTITY_INSERT [Finance].[Payment] OFF


SET IDENTITY_INSERT [Finance].[PaymentDebitCredit] ON 

INSERT [Finance].[PaymentDebitCredit] ([Id], [PaymentId], [DebitId], [CreditId]) VALUES (465, 71, 135, NULL)
INSERT [Finance].[PaymentDebitCredit] ([Id], [PaymentId], [DebitId], [CreditId]) VALUES (466, 72, 137, NULL)

SET IDENTITY_INSERT [Finance].[PaymentDebitCredit] OFF


SET IDENTITY_INSERT [Finance].[PaymentJournal] ON 

INSERT [Finance].[PaymentJournal] 
    ([Id], [BankAccountId], [JournalNumber], [BookingDate], [DueDate], [NumberOfPayments], [Amount], [Note], [MarkedForClosure], [Closed], [PaymentForTransferId], [Refund], [Archived]) 
VALUES 
    (46, 117, 1, CAST(N'2020-10-15T00:00:00.000' AS DateTime), CAST(N'2020-10-15' AS Date), 2, CAST(25.00 AS Decimal(12, 2)), NULL, 0, 1, NULL, 0, 0)

SET IDENTITY_INSERT [Finance].[PaymentJournal] OFF


SET IDENTITY_INSERT [Finance].[Transaction] ON 

INSERT [Finance].[Transaction] ([Id], [DebitId], [CreditId], [Date], [EntryDate], [Amount]) VALUES (3, 137, 4, CAST(N'2020-10-15' AS Date), CAST(N'2020-10-15T15:42:00.570' AS DateTime), CAST(20.00 AS Decimal(12, 2)))
INSERT [Finance].[Transaction] ([Id], [DebitId], [CreditId], [Date], [EntryDate], [Amount]) VALUES (4, 135, 2, CAST(N'2020-10-15' AS Date), CAST(N'2020-10-15T15:42:00.570' AS DateTime), CAST(5.00 AS Decimal(12, 2)))

SET IDENTITY_INSERT [Finance].[Transaction] OFF


SET IDENTITY_INSERT [BasicCatalog].[TerritorialAffiliation] ON 

INSERT [BasicCatalog].[TerritorialAffiliation] 
    ([Id], [Name])
VALUES
    (1, N'Republika Srpska'),
    (2, N'Federacija BiH')

SET IDENTITY_INSERT [BasicCatalog].[TerritorialAffiliation] OFF 


INSERT [BasicCatalog].[MeteringPointType]
    ([Id], [Name], [Code], [Consumer], [Producer], [Visible])
VALUES 
	(1, N'Potrošnja',             N'E17', 1, 0, 1),
	(2, N'Proizvodnja',           N'E18', 0, 1, 0),
	(3, N'Potrošnja-Proizvodnja', N'E19', 1, 0, 1),
	(4, N'Razmjena',              N'E20', 1, 0, 0)


SET IDENTITY_INSERT [Metering].[MeteringPoint] ON

INSERT [Metering].[MeteringPoint] 
    ([Id], [DsoId], [EIC], [DsoOfGridId], [MeteringPointInDsoId], [PlaceId], [StreetId], [AddressText], [StreetNumber], [PostOfficeId], [TerritorialAffiliationId], [MeteringPointTypeId]) 
VALUES 
    (0,        1, N'Nepoznato mjm',    1, 0, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (1,        1, N'AMOSA542A       ', 1, 0, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (2,        1, N'1514BASD99      ', 1, 0, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (61100001, 1, N'36Z03800001H    ', 1, 1, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (61100021, 1, N'36Z1SB1200027N  ', 1, 1, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (61100069, 1, N'36Z0SB00        ', 1, 1, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (61100089, 1, N'dfsf56456       ', 1, 1, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (61100265, 1, N'36Z0100154X     ', 1, 1, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (62100355, 1, N'36ZTZDM         ', 6, 1, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (64100070, 1, N'151414          ', 6, 1, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (64102062, 1, N'36Z400          ', 4, 1, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (64102347, 1, N'K009151661R     ', 4, 1, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (64102458, 1, N'36Z0SK009       ', 4, 1, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (64102459, 1, N'SK009281150R    ', 4, 1, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (64102666, 1, N'36Z0S501070Z    ', 4, 1, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (64102798, 1, N'36Z0SK085O      ', 4, 1, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (64103708, 1, N'36066699C       ', 4, 1, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (64103709, 1, N'3K0850660G      ', 4, 1, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (64103710, 1, N'36SK08501E      ', 4, 1, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (64103711, 2, N'36K085053       ', 4, 1, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (66100001, 2, N'36BL13          ', 6, 1, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (66100002, 3, N'36BL13B         ', 6, 1, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (66100003, 4, N'36ZBL17         ', 6, 1, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (66100004, 5, N'LUK3B24         ', 6, 1, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (66100005, 6, N'36Z53B1Z        ', 6, 1, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (66100006, 1, N'3PD53B2W        ', 6, 1, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1),
    (66100007, 1, N'36ZBLNG         ', 6, 1, 1, 1, N'Nepoznata ulica', N'NN', 78000, 1, 1)

SET IDENTITY_INSERT [Metering].[MeteringPoint] OFF


INSERT [Metering].[ReadingType] ([Id], [Name]) VALUES (1, N'Type of reading 1')


SET IDENTITY_INSERT [TariffSystem].[CalculationPower] ON 

INSERT [TariffSystem].[CalculationPower] ([Id], [TariffGroupId], [Measuring], [KW], [DateFrom], [DateTo]) VALUES (10, 1, 1, CAST(8.00 AS Decimal(5, 2)), CAST(N'2020-01-01' AS Date), NULL)

SET IDENTITY_INSERT [TariffSystem].[CalculationPower] OFF


SET IDENTITY_INSERT [TariffSystem].[CategoryOfConsumption] ON 

INSERT [TariffSystem].[CategoryOfConsumption] ([Id], [Name], [PrintName], [EbixCode]) VALUES (1, N'Tarifna kategorija 1', 'Tg1', '1')
INSERT [TariffSystem].[CategoryOfConsumption] ([Id], [Name], [PrintName], [EbixCode]) VALUES (21, N'Tarifna kategorija 2', 'Tg2', '2')
INSERT [TariffSystem].[CategoryOfConsumption] ([Id], [Name], [PrintName], [EbixCode]) VALUES (22, N'Tarifna kategorija 3', 'Tg3', '3')

SET IDENTITY_INSERT [TariffSystem].[CategoryOfConsumption] OFF


SET IDENTITY_INSERT [TariffSystem].[ContractNumberTemplateGroup] ON 

INSERT [TariffSystem].[ContractNumberTemplateGroup] ([Id], [Name]) VALUES (1, N'Grupa obrasca 1')

SET IDENTITY_INSERT [TariffSystem].[ContractNumberTemplateGroup] OFF


SET IDENTITY_INSERT [TariffSystem].[PriceCategory] ON 

INSERT [TariffSystem].[PriceCategory] 
    ([Id], [Name], [NettingCategory], [TenderPrice], [TimeRestricted], [PrintName]) 
VALUES 
    (1,  N'Kategorija cijene 1',  0, 0, 0, N'Kategorija cijene 1'),
    (7,  N'Kategorija cijene 2',  0, 0, 0, N'Kategorija cijene 2'),
    (20, N'Kategorija mrezarine', 1, 0, 0, N'Kategorija mrezarine')

SET IDENTITY_INSERT [TariffSystem].[PriceCategory] OFF


SET IDENTITY_INSERT [TariffSystem].[PriceList] ON 

INSERT [TariffSystem].[PriceList] ([Id], [TariffGroupId], [SeasonId], [PriceCategoryId], [TariffItemId], [Price], [VatRate], [DateFrom], [DateTo], [CalculationTypeId]) VALUES (12, 19, N'W', 7, 1, CAST(10.000000 AS Decimal(14, 6)), CAST(17 AS Numeric(18, 0)), CAST(N'2020-01-01' AS Date), CAST(N'2039-01-01' AS Date), 1)
INSERT [TariffSystem].[PriceList] ([Id], [TariffGroupId], [SeasonId], [PriceCategoryId], [TariffItemId], [Price], [VatRate], [DateFrom], [DateTo], [CalculationTypeId]) VALUES (13, 19, N'W', 7, 1, CAST(45.000000 AS Decimal(14, 6)), CAST(17 AS Numeric(18, 0)), CAST(N'2039-01-02' AS Date), CAST(N'2099-01-01' AS Date), 1)
INSERT [TariffSystem].[PriceList] ([Id], [TariffGroupId], [SeasonId], [PriceCategoryId], [TariffItemId], [Price], [VatRate], [DateFrom], [DateTo], [CalculationTypeId]) VALUES (18, 19, N'W', 1, 1, CAST(10.000000 AS Decimal(14, 6)), CAST(17 AS Numeric(18, 0)), CAST(N'2020-01-01' AS Date), CAST(N'2039-01-01' AS Date), 1)
INSERT [TariffSystem].[PriceList] ([Id], [TariffGroupId], [SeasonId], [PriceCategoryId], [TariffItemId], [Price], [VatRate], [DateFrom], [DateTo], [CalculationTypeId]) VALUES (19, 19, N'W', 1, 1, CAST(45.000000 AS Decimal(14, 6)), CAST(17 AS Numeric(18, 0)), CAST(N'2039-01-02' AS Date), CAST(N'2099-01-01' AS Date), 1)
INSERT [TariffSystem].[PriceList] ([Id], [TariffGroupId], [SeasonId], [PriceCategoryId], [TariffItemId], [Price], [VatRate], [DateFrom], [DateTo], [CalculationTypeId]) VALUES (14, 1, N'S', 1, 1, CAST(0.110000 AS Decimal(14, 6)), CAST(17 AS Numeric(18, 0)), CAST(N'2020-10-01' AS Date), CAST(N'2029-01-01' AS Date), 1)
INSERT [TariffSystem].[PriceList] ([Id], [TariffGroupId], [SeasonId], [PriceCategoryId], [TariffItemId], [Price], [VatRate], [DateFrom], [DateTo], [CalculationTypeId]) VALUES (15, 1, N'S', 1, 1, CAST(0.120000 AS Decimal(14, 6)), CAST(17 AS Numeric(18, 0)), CAST(N'2029-01-02' AS Date), CAST(N'2039-01-01' AS Date), 1)
INSERT [TariffSystem].[PriceList] ([Id], [TariffGroupId], [SeasonId], [PriceCategoryId], [TariffItemId], [Price], [VatRate], [DateFrom], [DateTo], [CalculationTypeId]) VALUES (16, 1, N'S', 1, 1, CAST(0.135000 AS Decimal(14, 6)), CAST(17 AS Numeric(18, 0)), CAST(N'2039-01-02' AS Date), CAST(N'2049-01-01' AS Date), 1)
INSERT [TariffSystem].[PriceList] ([Id], [TariffGroupId], [SeasonId], [PriceCategoryId], [TariffItemId], [Price], [VatRate], [DateFrom], [DateTo], [CalculationTypeId]) VALUES (17, 1, N'S', 1, 1, CAST(0.010000 AS Decimal(14, 6)), CAST(17 AS Numeric(18, 0)), CAST(N'2049-01-02' AS Date), CAST(N'2099-01-01' AS Date), 1)
INSERT [TariffSystem].[PriceList] ([Id], [TariffGroupId], [SeasonId], [PriceCategoryId], [TariffItemId], [Price], [VatRate], [DateFrom], [DateTo], [CalculationTypeId]) VALUES (22, 24, N'S', 1, 1, CAST(0.110000 AS Decimal(14, 6)), CAST(17 AS Numeric(18, 0)), CAST(N'2020-10-01' AS Date), CAST(N'2029-01-01' AS Date), 1)
INSERT [TariffSystem].[PriceList] ([Id], [TariffGroupId], [SeasonId], [PriceCategoryId], [TariffItemId], [Price], [VatRate], [DateFrom], [DateTo], [CalculationTypeId]) VALUES (23, 24, N'S', 1, 1, CAST(0.120000 AS Decimal(14, 6)), CAST(17 AS Numeric(18, 0)), CAST(N'2029-01-02' AS Date), CAST(N'2039-01-01' AS Date), 1)
INSERT [TariffSystem].[PriceList] ([Id], [TariffGroupId], [SeasonId], [PriceCategoryId], [TariffItemId], [Price], [VatRate], [DateFrom], [DateTo], [CalculationTypeId]) VALUES (20, 24, N'S', 1, 1, CAST(0.135000 AS Decimal(14, 6)), CAST(17 AS Numeric(18, 0)), CAST(N'2039-01-02' AS Date), CAST(N'2049-01-01' AS Date), 1)
INSERT [TariffSystem].[PriceList] ([Id], [TariffGroupId], [SeasonId], [PriceCategoryId], [TariffItemId], [Price], [VatRate], [DateFrom], [DateTo], [CalculationTypeId]) VALUES (21, 24, N'S', 1, 1, CAST(0.010000 AS Decimal(14, 6)), CAST(17 AS Numeric(18, 0)), CAST(N'2049-01-02' AS Date), CAST(N'2099-01-01' AS Date), 1)

SET IDENTITY_INSERT [TariffSystem].[PriceList] OFF


INSERT [TariffSystem].[Season] 
    ([Id], [Name], [DateFrom], [DateTo]) 
VALUES 
    (N'S', N'Ljetna', N'01.03.', N'30.09.'),
    (N'W', N'Zimska', N'01.10.', N'28.02.')


SET IDENTITY_INSERT [TariffSystem].[TariffGroup] ON 

INSERT [TariffSystem].[TariffGroup] ([Id], [CategoryOfConsumptionId], [TariffSuperGroupId], [ContractNumberTemplateGroupId], [Name], [Reactive], [Maxigraf], [MeterTypeId], [EbixCode], [ContractTypeId], [PrintName]) VALUES (1, 1, 1, 1, N'Tarifna grupa 1', 1, 1, 4, '1', 1,N'Tarifna grupa 1')
INSERT [TariffSystem].[TariffGroup] ([Id], [CategoryOfConsumptionId], [TariffSuperGroupId], [ContractNumberTemplateGroupId], [Name], [Reactive], [Maxigraf], [MeterTypeId], [EbixCode], [ContractTypeId], [PrintName]) VALUES (19, 1, 1, 1, N'Tarifna grupa 2', 1, 0, 4, '2', 1,N'Tarifna grupa 2')
INSERT [TariffSystem].[TariffGroup] ([Id], [CategoryOfConsumptionId], [TariffSuperGroupId], [ContractNumberTemplateGroupId], [Name], [Reactive], [Maxigraf], [MeterTypeId], [EbixCode], [ContractTypeId], [PrintName]) VALUES (23, 21, 17, 1, N'Tarifna grupa 3', 0, 0, 4, '3', 1,N'Tarifna grupa 3')
INSERT [TariffSystem].[TariffGroup] ([Id], [CategoryOfConsumptionId], [TariffSuperGroupId], [ContractNumberTemplateGroupId], [Name], [Reactive], [Maxigraf], [MeterTypeId], [EbixCode], [ContractTypeId], [PrintName]) VALUES (24, 1, 1, 1, N'Tarifna grupa 4', 0, 0, 4, '4', 1,N'Tarifna grupa 4')

SET IDENTITY_INSERT [TariffSystem].[TariffGroup] OFF


SET IDENTITY_INSERT [TariffSystem].[TariffItem] ON 

INSERT [TariffSystem].[TariffItem] 
    ([Id], [Description], [MeasureUnit], [Valid], [CalculationTypeId], [EbixCode], [MeteringPointTypeId]) 
VALUES 
    (1, N'Aht', N'kW', 1, 1, N'1.8.1', 1),
    (2, N'Alt', N'kW', 1, 1, N'1.8.2', 1),
    (3, N'Rht', N'kW', 1, 1, N'3.8.1', 1),
    (4, N'Rlt', N'kW', 1, 1, N'3.8.2', 1)

SET IDENTITY_INSERT [TariffSystem].[TariffItem] OFF


SET IDENTITY_INSERT [TariffSystem].[TariffSuperGroup] ON 

INSERT [TariffSystem].[TariffSuperGroup] 
    ([Id], [Name], [PrintName]) 
VALUES 
    (1,  N'Tarifna nadgrupa 1', 'Nadgurpa 1'),
    (17, N'Tarifna nadgrupa 2', 'Nadgrupa 2'),
    (18, N'Tarifna nadgrupa 3', 'Nadgrupa 3')

SET IDENTITY_INSERT [TariffSystem].[TariffSuperGroup] OFF


INSERT [Customer].[ContractDeclineReason] 
    ([Id], [Name]) 
VALUES 
    (N'CMP', N'Prethodni snabdjevač je podnio žalbu na zahtev za ugovor'),
    (N'E09', N'Instalacija se ne može identifikovati'),
    (N'E0H', N'Podaci nisu dostupni'),
    (N'E10', N'Mjerno mjesto se ne može identifikovati'),
    (N'E14', N'Drugi razlog'),
    (N'E17', N'Traženi datum promene nije u vremenskim ograničenjima'),
    (N'E22', N'Mjerno mjesto je blokirano za prebacivanje'),
    (N'E37', N'Nema važećeg ugovora o pristupu mreži'),
    (N'E50', N'Period nije validan'),
    (N'E55', N'Neovlašćeno izmereni podaci'),
    (N'E81', N'Mjerno mjesto nije povezano')


SET IDENTITY_INSERT [BasicCatalog].[ContractDeactivationReason] ON 

INSERT [BasicCatalog].[ContractDeactivationReason] ([Id], [Name]) VALUES (1, N'Test 1')

SET IDENTITY_INSERT [BasicCatalog].[ContractDeactivationReason] OFF


----vrati constrainte

EXEC sp_MSForEachTable 'ALTER TABLE ? WITH CHECK CHECK CONSTRAINT ALL' 
GO